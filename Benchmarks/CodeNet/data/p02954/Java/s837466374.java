import java.io.*;
import java.util.*;

 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      String S=sc.next();
      int N=S.length();
      String anslst[]=new String[N];
      ArrayList<Integer[]> rlc=new ArrayList<>();

      for(int i=0;i<N;i++){
          anslst[i]="0";
      }
      for(int i=0;i<N;i++){
          Integer tmp[]=new Integer[2];
          int j=0;
          
          while(i+j<N && S.charAt(i)==S.charAt(i+j)){
              j++;
          }
          tmp[0]=i;
          tmp[1]=j;
          rlc.add(tmp);
          i+=j-1;
      }

      for(int i=0;i<rlc.size();i+=2){
          Integer[] r=rlc.get(i);
          Integer[] l=rlc.get(i+1);

          anslst[l[0]]=String.valueOf(r[1]/2+(l[1]+1)/2);
          anslst[l[0]-1]=String.valueOf((r[1]+1)/2+l[1]/2);
      }
      out.println(String.join(" ", anslst));
      
      out.close();
   }

   public static int binarySearch(Integer[] a,int x)
   {
       int right=a.length-1;
       int left=0;

       while(right-left>0){
           int center=(right+left)/2;

           if(x>a[center]){
               left=center+1;
           }else{
               right=center; 
           }
       }
       return right;
   }

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
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