import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  /*      StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int nn = 2*100000+1;
        int N = 1; while(N < nn) N <<= 1;
        int q = Integer.parseInt(st1.nextToken());
        PriorityQueue<Integer>[] in = new PriorityQueue[N+1];
        int rating[] = new int[n+1];
        int ind[] = new int[n+1];
        for(int i = 0 ; i < in.length ; i++)
        {
            in[i] = new PriorityQueue<>((a,b)-> a>b? -1 : a < b ? 1 : 0);
        }
        for(int i = 1 ; i <= n ; i++)
        {
            st1 = new StringTokenizer(br.readLine());
            rating[i] = Integer.parseInt(st1.nextToken());
            ind[i] = Integer.parseInt(st1.nextToken());
            in[ind[i]].add(rating[i]);
        }
        SegmentTree sg = new SegmentTree(in , ind , rating);

        for(int i = 0 ; i < q ; i++)
        {
            st1 = new StringTokenizer(br.readLine());

            sg.update_point(Integer.parseInt(st1.nextToken()) , Integer.parseInt(st1.nextToken()));


            out.println(sg.query(1 , N));


        }*/

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        long arr[] = new long [n];
        long res = 0;
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Long.parseLong(st1.nextToken());
            res = res ^ arr[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++)
            sb.append((res^arr[i]) + " ");
        out.println(sb);
        out.flush();
        out.close();

    }
    static class SegmentTree {        // 1-based DS, OOP

        int N;            //the number of elements in the array as a power of 2 (i.e. after padding)
        int[] sTree;
        PriorityQueue<Integer>[] array;
        int[] ind, rating;




        SegmentTree(PriorityQueue<Integer>[] in , int[] ind, int[] rating) {
            array = in;
            this.ind = ind;
            this.rating = rating;
            N = in.length - 1;
            sTree = new int[N << 1];        //no. of nodes = 2*N - 1, we add one to cross out index zero
            Arrays.fill(sTree , Integer.MAX_VALUE);
            build(1, 1, N);
        }

        void build(int node, int b, int e)    // O(n)
        {
            if (b == e) {
                if (!array[b].isEmpty()) {
                    sTree[node] = array[b].peek();

                }
            }
            else {
                int mid = b + e >> 1;
                build(node << 1, b, mid);
                build(node << 1 | 1, mid + 1, e);
                sTree[node] = Math.min(sTree[node << 1] , sTree[node << 1 | 1]);
            }
        }


        void update_point(int index1 , int index2)            // O(log n)
        {
            array[ind[index1]].remove(rating[index1]);
            array[index2].add(rating[index1]);
            int index11 = ind[index1] + N - 1;
            int index22 = index2 + N - 1;

            sTree[index11] = array[ind[index1]].isEmpty()? Integer.MAX_VALUE : array[ind[index1]].peek();
            sTree[index22] = array[index2].peek();
            ind[index1] = index2;

            while (index11 > 1) {
                index11 >>= 1;
                sTree[index11] = Math.min(sTree[index11 << 1] , sTree[index11 << 1 | 1]);
            }
            while (index22 > 1) {
                index22 >>= 1;
                sTree[index22] = Math.min(sTree[index22 << 1] , sTree[index22 << 1 | 1]);
            }
        }


        int query(int i, int j) {
            return query(1, 1, N, i, j);
        }

        int query(int node, int b, int e, int i, int j)    // O(log n)
        {
            if (i > e || j < b)
                return Integer.MAX_VALUE;
            if (b >= i && e <= j)
                return sTree[node];
            int mid = b + e >> 1;
            int q1 = query(node << 1, b, mid, i, j);
            int q2 = query(node << 1 | 1, mid + 1, e, i, j);
            return Math.min(q1 , q2);

        }
    }

}
