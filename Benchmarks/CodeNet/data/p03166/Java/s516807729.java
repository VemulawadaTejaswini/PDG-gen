import java.util.*;
import java.io.*;


class Main {
    static int memo[];
    static ArrayList<Integer> edges[];
    static int n,m;

    public static int shortestPath(int node)
    {
        if(memo[node] != -1)
        {
            return memo[node];
        }

        memo[node] = 0;

        for(int i = 0 ; i < edges[node].size() ; i++)
        {
            memo[node] = Math.max(memo[node] , 1 + shortestPath(edges[node].get(i)));
        }

        return memo[node];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        edges = new ArrayList[n];
        memo = new int [n];

        Arrays.fill(memo , -1);

        for(int i = 0 ; i < n ; i++)
            edges[i] = new ArrayList<>();

        for(int i = 0 ; i < m ; i++)
        {
            st1 = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());

            edges[x-1].add(y-1);
        }

        int max = 0;

        for(int i = 0 ; i < n ; i++)
            max = Math.max(max , shortestPath(i));

        out.println(max);



        out.flush();
        out.close();
    }

}