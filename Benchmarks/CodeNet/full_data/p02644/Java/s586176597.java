
import java.io.*;
import java.util.*;

public class Main
{
    public static void print(String str,int val){
        System.out.println(str+"  "+val);
    }



    public static void debug(long[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(int[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(long[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;


        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        public FastReader(String path) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(path));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
//        FastReader s=new FastReader();
        FastReader s=new FastReader();
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        int start_x = s.nextInt()-1;
        int start_y = s.nextInt()-1;
        int end_x = s.nextInt()-1;
        int end_y = s.nextInt()-1;
        char[][] grid = new char[n][m];
        for(int i=0;i<n;i++){
            String str = s.nextLine();
            for(int j=0;j<m;j++){
                grid[i][j] = str.charAt(j);
            }
        }
        boolean[][] calculated = new boolean[n][m];
        int[][] dist = new int[n][m];
        for(int[] a:dist){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(start_x,start_y));
        int curr_dist =1;
        Pair delim = new Pair(-1,-1);
        queue.add(delim);
        dist[start_x][start_y] = 0;
        calculated[start_x][start_y] =true;
        while (!queue.isEmpty()){

            Pair p = queue.poll();
            if(isequal(p,delim)){
                if(queue.isEmpty()){
                    //do nothing
                    break;
                }
                else {
                    curr_dist++;
                    queue.add(delim);
                    continue;
                }
            }
            //now we have a pair we check in four directions
            //first right
            for(int i=1;i<=k;i++){
                int x = p.x;
                int y = p.y+i;
                if(y<m && grid[x][y]!='@' && !(dist[x][y]<=curr_dist)){
                    dist[x][y] = Math.min(dist[x][y],dist[p.x][p.y]+1);
                    if(dist[x][y]<=curr_dist){
                        calculated[x][y] = true;
                        if(x == end_x && y == end_y){
                            System.out.println(dist[x][y]);
                            return ;
                        }
                        queue.add(new Pair(x,y));
                    }
                }
//                else if(y<m && calculated[x][y]){
//                    continue;
//                }
                else {
                    break;
                }
            }
            //now left
            for(int i=1;i<=k;i++){
                int x = p.x;
                int y = p.y-i;
                if(y>=0 && grid[x][y]!='@' && !(dist[x][y]<=curr_dist)){
                    dist[x][y] = Math.min(dist[x][y],dist[p.x][p.y]+1);
                    if(dist[x][y]<=curr_dist){
                        calculated[x][y] = true;
                        if(x == end_x && y == end_y){
                            System.out.println(dist[x][y]);
                            return ;
                        }
                        queue.add(new Pair(x,y));
                    }
                }
//                else if(y>=0 && calculated[x][y]){
//                    continue;
//                }
                else {
                    break;
                }
            }
            //now down
            for(int i=1;i<=k;i++){
                int x = p.x+i;
                int y = p.y;
                if(x<n && grid[x][y]!='@' && !(dist[x][y]<=curr_dist)){
                    dist[x][y] = Math.min(dist[x][y],dist[p.x][p.y]+1);
                    if(dist[x][y]<=curr_dist){
                        calculated[x][y] = true;
                        if(x == end_x && y == end_y){
                            System.out.println(dist[x][y]);
                            return ;
                        }
                        queue.add(new Pair(x,y));
                    }
                }
//                else if(x<n && calculated[x][y]){
//                    continue;
//                }
                else {
                    break;
                }
            }
            //now up
            for(int i=1;i<=k;i++){
                int x = p.x-i;
                int y = p.y;
                if(x>=0 && grid[x][y]!='@' && !(dist[x][y]<=curr_dist)){
                    dist[x][y] = Math.min(dist[x][y],dist[p.x][p.y]+1);
                    if(dist[x][y]<=curr_dist){
                        calculated[x][y] = true;
                        if(x == end_x && y == end_y){
                            System.out.println(dist[x][y]);
                            return ;
                        }
                        queue.add(new Pair(x,y));
                    }
                }
                else {
                    break;
                }
            }

        }
        System.out.println(-1);
    }
    static boolean isequal(Pair a,Pair b){
        return (a.x==b.x) && (a.y==b.y);
    }
     static class Pair{
        int x ;
        int y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }




//    OutputStream out = new BufferedOutputStream( System.out );
//        for(int i=1;i<n;i++){
//    out.write((arr[i]+" ").getBytes());
//}
//        out.flush();

    //  long start = System.currentTimeMillis();
//  long end = System.currentTimeMillis();
//  System.out.println((end - start) + "ms");



}
