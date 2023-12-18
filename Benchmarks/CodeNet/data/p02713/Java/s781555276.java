import java.util.*;
import java.io.*;
public class main
{
 static Hashtable<String ,Integer>hash=new Hashtable<>();
  public static void main(String args[]) throws java.lang.Exception
  {
    MyScanner sc = new MyScanner();
  
     //  hash=new Hashtable<>();

    int n=Integer.parseInt(sc.nextLine());
    Hashtable<String,Integer>hash=new Hashtable<>();
    long c=0;
    int gcd[][]=new int[n+1][n+1];
    for(int i=1;i<=n;i++)
    {
      for(int j=i;j<=n;j++)
      {
        gcd[i][j]=gcd1(i,j);
      }
    }
    for(int k=1;k<=n;k++)
    {
      for(int i=1;i<=n;i++)

      {
        for(int j=1;j<=n;j++)
        {
          int a[]=new int[3];
          a[0]=i;
          a[1]=j;
          a[2]=k;
          Arrays.sort(a);
          if(hash.containsKey(a[0]+" "+a[1]+" "+a[2])){c+=(long)hash.get(a[0]+" "+a[1]+" "+a[2]);}
        else{  int aa=gcd[a[0]][a[1]];
          if(aa==1){c+=(long)1;hash.put(a[0]+" "+a[1]+" "+a[2],1);}
          else{
            int jj=gcd[Math.min(aa,a[2])][Math.max(aa,a[2])];
            // System.out.println(jj);
            c+=jj;hash.put(a[0]+" "+a[1]+" "+a[2],jj);}
        }


        }
      }
    }
    System.out.println(c);
       
     
     
   }
   static int gcd1(int a, int b)
   {
    return func(Math.min(a,b),Math.max(a,b));
   }
   static int func(int a, int b)
   {
    if(a==0){return b;}
    return func(b%a,a);
   }
     
  
  

  
  }

   class MyScanner {
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