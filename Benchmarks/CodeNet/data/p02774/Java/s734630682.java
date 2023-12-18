import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    long[] b=new long[n*(n-1)/2];
    int cnt=-1;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        cnt++;
        b[cnt]=a[i]*a[j];
      }
    }
    Arrays.sort(b);
    System.out.println(b[k-1]);
  }
}
