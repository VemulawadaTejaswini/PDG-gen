import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n+1];//使えない階段の番号(インデックスの値に対応)
    int[] b = new int[n];//i+1段目までの場合の数
    boolean j0,j1,j2 ;
    int count = 0;

    for(int i=0; i<m; i++){
      a[sc.nextInt()] = -1;
    }
    b[0] = (a[1]==-1)?0:1;//1段目
    b[1] = (a[1]==-1)?1:2;//2段目
    for(int i=2;i<n;i++){
      System.out.println(i+1);
      if(a[i+1] == -1){continue;}
      b[i-1] = (a[i]==-1)? 0:b[i-1];
      //System.out.println("b-1:"+b[i-1]);
      b[i-2] = (a[i-1]==-1)?0:b[i-2];
      //System.out.println("b-2:"+b[i-2]);
      b[i] = b[i-1] + b[i-2];
      b[i] = b[i]%1000000007;
      //System.out.println("b:"+b[i]);

      //System.out.println(i+1+":"+b[i]);
    }
    System.out.println(b[n-1]);


  }
}