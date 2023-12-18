import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int[][] a=new int[n][d];
    for(int i=0;i<n;i++){
      for(int j=0;i<d;i++){
        a[i][j]=sc.nextInt();
      }
    }
    int ans=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        int b=0;
        for(int k=0;k<d;k++){
          b+=Math.sqrt(Math.abs(a[i][k]-a[j][k])*Math.abs(a[i][k]-a[j][k]));
        }
        if((int)b==(int)Math.floor(b)){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}