import java.util.*;
import java.io.*;
public class Main{
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
 	    	 arr = new pair[n];
 	    	 for(int i=0; i<n; i++){
 	    	     st = new StringTokenizer(br.readLine());
 	    	  arr[i] = new pair(Integer.parseInt(st.nextToken()),Long.parseLong(st.nextToken()));
 	    	 }
 	    	 dp = new long[n+5][w+5];
 	    	 for(int i=0; i<n+5; i++) Arrays.fill(dp[i],-1l);
 	    	 out.println(solve(0,0));
              out.flush();
 	    	  }
 	    	  static int n;
 	    	  static int w;
 	    	  static long[][] dp;
 	    	  static pair [] arr;
              public static long solve(int i, int sum){
                  if(i>=n) return 0l;
                  if(sum>w) return(long)( -1e17);
                  if(dp[i][sum]!=-1) return dp[i][sum];
                  long take = (sum+arr[i].a<=w)?arr[i].b+ solve(i+1,sum+arr[i].a):(long)(-1e17);
                  long leave = solve(i+1,sum);
                  return dp[i][sum] = Math.max(take,leave);
              }
	}
	
	
