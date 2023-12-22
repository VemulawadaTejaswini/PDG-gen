import java.util.*;


import java.io.*;
/**
 * MLASERP
 */
public class Main {

    
    static MyScanner in  = new MyScanner();
   static int mod  = 1000000007;
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static StringTokenizer st;
      static int []dr  = {1,-1,0,0};
      static int [] dc = {0,0,-1,1};
public static void main(String[] args) {
    int N = in.nextInt();
    int [ ]L= new int[N];
    for(int i=0;i<N;i++){
        L[i] = in.nextInt();
    }
    long cnt =0;
    for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
            for(int k=j+1;k<N;k++){
                cnt+=isTriangle(L[i],L[j],L[k]);
               
            }
        }
    }
    out.println(cnt);
   out.flush();
   

}

private static long isTriangle(int a, int b, int c) {
    if(a+b>c&&a+c>b&&b+c>a&&a!=b&&b!=c&&a!=c)
        return 1;
    return 0;
}

static int rcToxy(int r, int c, int W) {
    return r*W+c;
}
static class Node{
    int r, c,prev,change;
    Node(int r, int c){
        this.r =r ;
        this.c = c;
    }
}
public static class MyScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }
 
      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }

   }
}