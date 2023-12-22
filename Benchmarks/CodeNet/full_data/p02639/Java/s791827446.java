import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Main{

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

  static class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new
          InputStreamReader(System.in));
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

    String[] nextSArray() {
      String sr[] = null;
      try {
        sr = br.readLine().trim().split(" ");
      } catch (IOException e) {
        e.printStackTrace();
      }
      return sr;
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }

      return str;
    }
  }

  //  static int MOD=1000000000+7;
//  public static void sortbyCol(int arr[][],int col)
//  {
//    Arrays.sort(arr,new Comparator<int[]>(){
//      @Override
//      public int compare(int[] o1, int[] o2) {
//        // To sort in descending order revert
//        // the '>' Operator
//        if(o1[col]>o2[col])
//          return 1;
//        else
//          return -1;
//      }
//    });
//  }


  public static void main(String[] args) throws java.lang.Exception {
    FastReader sc = new FastReader();
//   int t1=sc.nextInt();
//
//   for(int t=0;t<t1;++t)
//   {
//
//   }
    int ans=0;
    for(int i=0;i<5;++i)
    {
      if(sc.nextInt()==0)
        ans=i+1;
    }
    System.out.println(ans);
  }

}

// out.println(al.toString().replaceAll("[\\[|\\]|,]",""));
