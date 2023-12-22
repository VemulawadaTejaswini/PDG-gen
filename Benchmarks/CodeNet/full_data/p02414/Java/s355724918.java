import java.util.*;
 
public class Main {
  private static Scanner sc=new Scanner(System.in);;

public static void main(String args[]) {
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();
    long temp1[][] = new long[n][m];
    long  temp2[][] = new long[m][l];
    for (int i=0;i<n;i++) {
      for (int j=0;j<m;j++) {
        temp1[i][j] = sc.nextInt();
      }
    }
    for (int i=0;i<m;i++){
      for(int j=0;j<l;j++) {
        temp2[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<l;j++) {
        int ans=0;
        for (int k=0;k<m;k++) {
          ans+=temp1[i][k]*temp2[k][j];
        }
        System.out.printf(j==l-1?"%d%n":"%d ",ans);
      }
    }
  }
}