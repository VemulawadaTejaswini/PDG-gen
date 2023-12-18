import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=s.length();
    int[][] a=new int[2][n];
    for(int i=0;i<n;i++){
      a[0][i]=i+(s.charAt(i)=='R'?1:-1);
    }
    for(int k=0;k<35;k++){
      for(int i=0;i<2;i++){
        for(int j=0;j<n;j++){
          a[m(i)][j]=a[i][a[i][j]];
        }
      }
    }
    int[] ans=new int[n];
    for(int i=0;i<n;i++){
      ans[a[0][i]]++;
    }
    for(int i=0;i<n-1;i++){
      System.out.print(ans[i]+" ");
    }
    System.out.println(ans[n-1]);
  }
  static int m(int i){
    return i==0?1:0;
  }
}