import java.io.*;
import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int mod = 1000000000+7;
    int n = in.nextInt();
    int m = in.nextInt();

    int a[][] = new int[n+1][m+1];
    for(int i=0;i<n;i++){
      String s = in.next();
      for(int j=0;j<s.length();j++)
        a[i+1][j+1] = s.charAt(j)=='#' ? -1 : 0;
    }
    for(int i=1;i<a.length;i++)
      for(int j=1;j<a[i].length;j++)
        a[i][j] = getVal(a,i,j,mod);

    System.out.println(a[n][m]%mod);
  }

  public static int getVal(int a[][], int i, int j, int m){
    if(i==1 && j==1) return 1;
    if(a[i][j]==-1) return 0;

    return (a[i-1][j]+a[i][j-1])%m;
  }

}
