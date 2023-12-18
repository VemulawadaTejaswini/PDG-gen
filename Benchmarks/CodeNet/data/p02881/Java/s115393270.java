import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c[]=new int[n+1];
    int m=0;
    int temp;

    for (int i=1;i<=n;i++) {
      for (int j=1;j<=n;j++) {
        if (i*j==n) {
          c[m]=(i-1)+(j-1);
          m++;
        }
      }
    }

    for (int i=0;i<m-1;i++) {
      for (int j=i+1;j<m;j++) {
        if(c[i]>c[j]){
          temp=c[i];
          c[i]=c[j];
          c[j]=temp;
        }
      }
    }

    System.out.println(c[0]);

  }
}
