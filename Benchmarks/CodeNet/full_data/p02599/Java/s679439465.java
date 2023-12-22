
import java.io.*;
import java.util.*;

class Main
{
    static int MAX = 1000001;

    // structure to store queries
    static class Query
    {
        int l, r, idx;
    }

    // updating the bit array
    static void update(int idx, int val,int bit[], int n)
    {
        for (; idx <= n; idx += idx & -idx)
            bit[idx] += val;
    }

    // querying the bit array
    static int query(int idx, int bit[], int n)
    {
        int sum = 0;
        for (; idx > 0; idx -= idx & -idx)
            sum += bit[idx];
        return sum;
    }

    static void answeringQueries(int[] arr, int n,
                                 Query[] queries, int q)
    {

        // initialising bit array
        int[] bit = new int[n + 1];
        Arrays.fill(bit, 0);

        // holds the rightmost index of any number
        // as numbers of a[i] are less than or equal to 10^6
        int[] last_visit = new int[MAX];
        Arrays.fill(last_visit, -1);

        // answer for each query
        int[] ans = new int[q];
        int query_counter = 0;
        for (int i = 0; i < n; i++)
        {

            // If last visit is not -1 update -1 at the
            // idx equal to last_visit[arr[i]]
            if (last_visit[arr[i]] != -1)
                update(last_visit[arr[i]] + 1, -1, bit, n);

            // Setting last_visit[arr[i]] as i and updating
            // the bit array accordingly
            last_visit[arr[i]] = i;
            update(i + 1, 1, bit, n);

            // If i is equal to r of any query store answer
            // for that query in ans[]
            while (query_counter < q && queries[query_counter].r == i)
            {
                ans[queries[query_counter].idx] =
                        query(queries[query_counter].r + 1, bit, n)
                                - query(queries[query_counter].l, bit, n);
                query_counter++;
            }
        }

        // print answer for each query
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < q; i++)
            sb.append(ans[i]);
        System.out.print(sb);
    }

    // Driver Code
    public static void main(String[] args)throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),q=Integer.parseInt(s[1]);
        int a[]=new int[n],i;
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);

        Query[] queries = new Query[q];
        for (i = 0; i < q; i++)
        {
            queries[i] = new Query();
            s=bu.readLine().split(" ");
            queries[i].l=Integer.parseInt(s[0])-1;
            queries[i].r=Integer.parseInt(s[1])-1;
            queries[i].idx=i;
        }


        Arrays.sort(queries, new Comparator<Query>()
        {
            public int compare(Query x, Query y)
            {
                if (x.r < y.r)
                    return -1;
                else if (x.r == y.r)
                    return 0;
                else
                    return 1;
            }
        });
        answeringQueries(a, n, queries, q);
    }
}

