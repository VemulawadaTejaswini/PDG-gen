import java.util.*;
import java.io.*;
import java.math.*;

public class Main{



  public static OutputStream out=new BufferedOutputStream(System.out);
  static Scanner sc=new Scanner(System.in);
  static long MOD=1000000007l;
  static int INF=10000000;
  static int[] rr=new int[]{1, 0, -1, 0};                                 //rook row move
  static int[] rc=new int[]{0, 1, 0, -1};                                 //rook col move

  //nl-->neew line; //l-->line;  //arp-->array print;  //arpnl-->array print new line
  public static void nl(Object o) throws IOException{out.write((o+"\n").getBytes()); }
  public static void l(Object o) throws IOException{out.write((o+"").getBytes());}
  public static void arp(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+" ").getBytes()); out.write(("\n").getBytes());}
  public static void arpnl(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+"\n").getBytes());}
  public static void scanl(long[] a,int n) {for(int i=0;i<n;i++) a[i]=sc.nextLong();}
  public static void scani(int[] a,int n) {for(int i=0;i<n;i++) a[i]=sc.nextInt();}
  public static void scan2D(int[][] a,int n,int m) {for(int i=0;i<n;i++) for(int j=0;j<m;j++) a[i][j]=sc.nextInt();}
  //static variables

  //


  public static void main(String[] args) throws IOException{
    long sttm=System.currentTimeMillis();
    long mod=1000000007l;

    int n=sc.nextInt();
    long[][] dp=new long[n][4];
    dp[0][0]=8;dp[0][1]=0;dp[0][2]=1;dp[0][3]=1;
    for(int i=1;i<n;i++){
        dp[i][0]=(dp[i-1][0]*8)%mod;
        dp[i][1]=(((dp[i-1][1]*10)%mod+dp[i-1][2])%mod+dp[i-1][3])%mod;
        dp[i][2]=((dp[i-1][2]*9)%mod+dp[i-1][0])%mod;
        dp[i][3]=((dp[i-1][3]*9)%mod+dp[i-1][0])%mod;
    }
    nl(dp[n-1][1]);

    out.flush();
  }


  public static long powMOD(long n,long k){                 //n-pow(k)
      if(k==1){
          return n%MOD;
      }
      if(k==0){
          return 1;
      }
      long val=powMOD(n,k/2)%MOD;
      if(k%2==0)return ((val%MOD)*(val%MOD))%MOD;
      else return (((val*val)%MOD)*n)%MOD;
  }


}

class Pair{
  int x; int y;
  Pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}
