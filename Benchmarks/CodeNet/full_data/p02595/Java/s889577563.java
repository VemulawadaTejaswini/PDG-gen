import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static OutputStream out=new BufferedOutputStream(System.out);
  static Scanner sc=new Scanner(System.in);
  static long mod=1000000007l;
  static int INF=1000000;

  //nl-->neew line; //l-->line;  //arp-->array print;  //arpnl-->array print new line
  public static void nl(Object o) throws IOException{out.write((o+"\n").getBytes()); }
  public static void l(Object o) throws IOException{out.write((o+"").getBytes());}
  public static void arp(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+" ").getBytes()); out.write(("\n").getBytes());}
  public static void arpnl(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+"\n").getBytes());}
  public static void scanl(long[] a,int n) {for(int i=0;i<n;i++) a[i]=sc.nextLong();}
  public static void scani(int[] a,int n) {for(int i=0;i<n;i++) a[i]=sc.nextInt();}
  public static void scan2D(int[][] a,int n,int m) {for(int i=0;i<n;i++) for(int j=0;j<m;j++) a[i][j]=sc.nextInt();}
  //
  static long cnt;
  static TreeSet<Integer> ans;
  static int n,m;
  static boolean[][] dp,vis;
  static HashMap<Pair,Boolean> arrl;
  static Stack<Integer> stk;
  static Queue<Integer> queue;
  static HashSet<Integer> mtrnode;
  static ArrayList<Integer> arrlans;


  public static void main(String[] args) throws IOException{
    long sttm=System.currentTimeMillis();
    long mod=1000000007l;

    int n=sc.nextInt();
    double d=sc.nextDouble();
    double[] xy=new double[n];
    int cnt=0;
    for(int i=0;i<n;i++){
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        xy[i]=Math.sqrt(x*x+y*y);
        if(xy[i]<=d) cnt++;
    }
    nl(cnt);


    out.flush();
  }

}

class Pair{
  int x,y;
  Pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}
