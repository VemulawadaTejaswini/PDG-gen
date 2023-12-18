import java.util.*;
import java.io.*;
public class Main
{
 static Hashtable<String ,Integer>hash=new Hashtable<>();
  public static void main(String args[]) throws java.lang.Exception
  {
    MyScanner sc = new MyScanner();
  
     //  hash=new Hashtable<>();

    HashSet<Integer>set1=new HashSet<>();
    HashSet<Integer>set3=new HashSet<>();
    HashSet<Integer>set2=new HashSet<>();
    int n=Integer.parseInt(sc.nextLine());
    String h=sc.nextLine();
    long c=0;
    ArrayList<Integer>red=new ArrayList<>();
    ArrayList<Integer>green=new ArrayList<>();
    ArrayList<Integer>blue=new ArrayList<>();
    for(int i=0;i<h.length();i++)
    {
      if(h.charAt(i)=='R'){red.add(i);set1.add(i);}
      else if(h.charAt(i)=='G'){green.add(i);set2.add(i);}
      else{blue.add(i);set3.add(i);}
    }
    for(int i=0;i<red.size();i++)
    {
      int index=Collections.binarySearch(green,red.get(i));
      if(index<0){index=Math.abs(index)-1;}
      for(int j=index;j<green.size();j++)
      {
        int index1=Collections.binarySearch(blue,green.get(j));
        if(index1<0){index1=Math.abs(index1)-1;}
        if(set3.contains(2*green.get(j)-red.get(i))){c-=1;}
        c+=(long)blue.size()-index1;
      }
    }
    for(int i=0;i<red.size();i++)
    {
      int index=Collections.binarySearch(blue,red.get(i));
      if(index<0){index=Math.abs(index)-1;}
      for(int j=index;j<blue.size();j++)
      {
        int index1=Collections.binarySearch(green,blue.get(j));
        if(index1<0){index1=Math.abs(index1)-1;}
        if(set2.contains(2*blue.get(j)-red.get(i))){c-=1;}
        c+=(long)green.size()-index1;
      }
    }
    for(int i=0;i<green.size();i++)
    {
      int index=Collections.binarySearch(blue,green.get(i));
      if(index<0){index=Math.abs(index)-1;}
      for(int j=index;j<blue.size();j++)
      {
        int index1=Collections.binarySearch(red,blue.get(j));
        if(index1<0){index1=Math.abs(index1)-1;}
        if(set1.contains(2*blue.get(j)-green.get(i))){c-=1;}
        c+=(long)red.size()-index1;
      }
    }
    for(int i=0;i<green.size();i++)
    {
      int index=Collections.binarySearch(red,green.get(i));
      if(index<0){index=Math.abs(index)-1;}
      for(int j=index;j<red.size();j++)
      {
        int index1=Collections.binarySearch(blue,red.get(j));
        if(index1<0){index1=Math.abs(index1)-1;}
        if(set3.contains(2*red.get(j)-green.get(i))){c-=1;}
        c+=(long)blue.size()-index1;
      }
    }
    for(int i=0;i<blue.size();i++)
    {
      int index=Collections.binarySearch(red,blue.get(i));
      if(index<0){index=Math.abs(index)-1;}
      for(int j=index;j<red.size();j++)
      {
        int index1=Collections.binarySearch(green,red.get(j));
        if(index1<0){index1=Math.abs(index1)-1;}
        if(set2.contains(2*red.get(j)-blue.get(i))){c-=1;}
        c+=(long)green.size()-index1;
      }
    }
    for(int i=0;i<blue.size();i++)
    {
      int index=Collections.binarySearch(green,blue.get(i));
      if(index<0){index=Math.abs(index)-1;}
      for(int j=index;j<green.size();j++)
      {
        int index1=Collections.binarySearch(red,green.get(j));
        if(index1<0){index1=Math.abs(index1)-1;}
        if(set1.contains(2*green.get(j)-blue.get(i))){c-=1;}
        c+=(long)red.size()-index1;
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