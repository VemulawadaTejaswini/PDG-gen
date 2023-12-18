import java.util.*;
import java.io.*;
public class Main {
   static class pair implements Comparable<pair>{
        int a;
        long b;
        public pair(int a, long b){
            this.a=a;
            this.b=b;
        }
        public int compareTo(pair p){
            return (a-p.a==0)?Long.compare(b,p.b):a-p.a;
        }
          
   }
  public static void main(String[] args) throws IOException,InterruptedException{
	BufferedReader	 br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out = new PrintWriter(System.out);
     	// String s = br.readLine();
        // char[] arr=s.toCharArray();
        // ArrayList<Integer> arrl = new ArrayList<Integer>(); 
        // TreeSet<Integer> ts1 = new TreeSet<Integer>(); 
        // HashSet<Integer> h = new HashSet<Integer>(); 
        // HashMap<Integer, Integer> map= new HashMap<>(); 
        // PriorityQueue<String> pQueue = new PriorityQueue<String>(); 
        // LinkedList<String> object = new LinkedList<String>(); 
        // StringBuilder str = new StringBuilder();
        
        //*******************************************************//
 	   //  StringTokenizer   st = new StringTokenizer(br.readLine());
 	   // 	  int t = Integer.parseInt(st.nextToken());
 	   //    while(t-->0){
 	   //        st = new StringTokenizer(br.readLine());
 	   // 	  int n = Integer.parseInt(st.nextToken());
 	   // 	  int[] arr = new int[n];
 	   // 	  st = new StringTokenizer(br.readLine());
 	   // 	  for(int i=0; i<n; i++){
 	   // 	      arr[i] =Integer.parseInt(st.nextToken());
 	   // 	  }
 	   // 	  int ans =0;
 	   // 	  out.println(ans);
 	   //    }
 	         StringTokenizer   st = new StringTokenizer(br.readLine());
 	    	  n = Integer.parseInt(st.nextToken());
 	    	  w = Integer.parseInt(st.nextToken());
 	    	 arr = new char[n][w];
 	    	 for(int i=0; i<n; i++){
 	    	    arr[i] = br.readLine().toCharArray();
 	    	 }
 	    	 dp = new long[n+5][w+5];
 	    	 for(int i=0; i<n+5; i++) Arrays.fill(dp[i],-1l);
 	    	 out.println(solve(0,0)%mod);
              out.flush();
 	    	  }
 	    	  static int mod = (int) 1e9+7;
 	    	  static int n;
 	    	  static int w;
 	    	  static long[][] dp;
 	    	  static char [][] arr;
              public static long solve(int i, int j){
                  if(i==n-1&&j==w-1) return 1l;
                  if(i>=n||j>=w) return 0l;
                  if(arr[i][j]=='#') return 0l;
                  if(dp[i][j]!=-1) return dp[i][j];
                  return dp[i][j] = (solve(i+1,j)%mod+solve(i,j+1)%mod)%mod;
              }
	}
	
	
