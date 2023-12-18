import java.io.*;
import java.util.*;

 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      String s=sc.next();
      String t=sc.next();
      char c[]=s.toCharArray();
      char d[]=t.toCharArray();
      boolean flag=true;
      int cnt=0;
      int k=0;

      for(int i=0;i<26;i++){
          alphabet.add(new ArrayList<Integer>());
      }

      for(int i=0;i<s.length();i++){
          int p=(int)(c[i]-'a');
          ArrayList<Integer> alp=alphabet.get(p);
          alp.add(i);
      }

      for(int i=0;i<t.length();){
          int j=0;
          k=-1;
          cnt++;
          while(i+j<t.length()){
              int p=(int)(d[i+j]-'a');
              k=binarysearch(p, k+1);

              if(k<0){
                  break;
              }
              j++;
          }

          if(j==0){
              flag=false;
              break;
          }
          i+=j;
      }

      if(flag){
          out.println((long)s.length()*(long)(cnt-1)+(long)k+1L);
      }else{
          out.println(-1);
      }
      out.close();
   }

   public static ArrayList<ArrayList<Integer>> alphabet=new ArrayList<>();

   public static int binarysearch(int p,int key)
   {
       int ng=-1;
       ArrayList<Integer> alp=alphabet.get(p);
       int ok=(int)alp.size();

       while((int)Math.abs(ok-ng)>1){
           int mid=(ok+ng)/2;

           if(alp.get(mid)<key){
               ng=mid;
           }else{
               ok=mid;
           }
       }
       if(ok<alp.size()){
           return alp.get(ok);
       }
       return -1;
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