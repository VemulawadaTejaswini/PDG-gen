import java.util.*;
import java.io.*;
public class Main {
   static class pair implements Comparable<pair>{
        int a;
        int b;
        public pair(int a, int b){
            this.a=a;
            this.b=b;
        }
        public int compareTo(pair p){
            return (a-p.a==0)?Integer.compare(b,p.b):a-p.a;
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
 	          arr = br.readLine().toCharArray();
 	           arr2 = br.readLine().toCharArray();
 	           n1 = arr.length;
 	           n2 = arr2.length;
 	          dp = new int[n1+1][n2+1];
 	          for(int i=0; i<=n1; i++) Arrays.fill(dp[i],-1);
 	          int ans = solve(0,0);
 	          out.println(trace(0,0));
 	          
              out.flush();
 	    	  }
 	    	  static int n1;
 	    	  static int n2;
 	    	  static char [] arr;
 	    	  static char [] arr2;
 	    	  static int[][] dp;
              public static int solve(int i, int j){
                  if(i>=n1||j>=n2) return 0;
                  if(dp[i][j]!=-1) return dp[i][j];
                  if(arr[i]==arr2[j]) return dp[i][j]= 1+ solve(i+1,j+1);
                  else return dp[i][j]= Math.max(solve(i+1,j),solve(i,j+1));

              }
               public static String trace(int i, int j){
                  if(i>=n1||j>=n2) return "";
                  if(1+solve(i+1,j+1)==solve(i,j)) return arr[i]+""+trace(i+1,j+1);
                  if(solve(i+1,j)>=solve(i,j+1)) return trace(i+1,j);
                  else return trace(i,j+1);
              }
	}
	
	
