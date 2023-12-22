import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static FastScanner fs = new FastScanner();
    public static void main(String[] args) {

        int t = fs.nextInt();
        int x [] = new int[t];
        int y [] = new int [t];

       for(int l=0;l<t;l++)
        {
            x[l] = fs.nextInt(); // x coordinates od cities
            y[l] = fs.nextInt(); // y coordinates of cities
        }
       int dp[] = new int [t];
        boolean visited[] = new boolean[t];
       for(int i=0;i<t;i++)
       {
           Arrays.fill(visited,false);
          int a = solve(x,y,t,i,1,visited,dp);
           System.out.println(a);
       }

    }
    private  static int  solve(int []x,int []y,int t,int city,int res,boolean visited[],int dp[])
    {
//      if(dp[city] !=0) {
//          visited[city] = true;
//          return dp[city];
//      }
      int a= 1;
        visited[city] = true;
      for(int i=0;i<t;i++)
      {
          if(((x[i]>x[city] && y[i]>y[city]) || (x[i]<x[city] && y[i]<y[city]))&&(visited[i]==false))
          {

              a+=solve(x,y,t,i,res+1,visited,dp);
          }
      }
      return a;
    }


    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
        int  gcd(int a,int b)
        {
            while (b > 0)
            {
                int  temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        private int upper(int arr[],int key){
            int low = 0;
            int high = arr.length-1;
            while(low < high){
                int mid = low + (high - low+1)/2;
                if(arr[mid] <= key){
                    low = mid;
                }
                else{
                    high = mid-1;
                }
            }
            return low;
        }
        public int lower(int arr[],int key){
            int low = 0;
            int high = arr.length-1;
            while(low < high){
                int mid = low + (high - low)/2;
                if(arr[mid] >= key){
                    high = mid;
                }
                else{
                    low = mid+1;
                }
            }
            return low;
        }
    }
}