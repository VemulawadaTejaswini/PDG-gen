import java.util.*;
import java.io.*;
public class Main
{
 static Hashtable<String ,Integer>hash=new Hashtable<>();
  public static void main(String args[]) throws java.lang.Exception
  {
    MyScanner sc = new MyScanner();
  
     //  hash=new Hashtable<>();

    int n=Integer.parseInt(sc.nextLine());
    Hashtable<String,Integer>hash=new Hashtable<>();
    // long c=0;
    // int gcd[][]=new int[n+1][n+1];
    // for(int i=1;i<=n;i++)
    // {
    //   for(int j=i;j<=n;j++)
    //   {
    //     gcd[i][j]=gcd1(i,j);
    //   }
    // }
    long c=0;
    for(int k=1;k<=n;k++)
    {
      for(int i=1;i<=n;i++)

      {
        int kk=gcd1(i,k);
        for(int j=1;j<=n;j++)
        {
          c+=(long)gcd1(kk,j);
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