import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(), m = scan.nextInt(), k = scan.nextInt();
    long totalMin=0;
    int max;
    int i=0,j=0;
    int[] a=new int[n], b = new int[m];
    for(int l=0;l<n;l++)a[l]=scan.nextInt();
    for(int l=0;l<m;l++)b[l]=scan.nextInt();
    while(i<n && totalMin+a[i]<=k){
      totalMin+=a[i];
      i++;
    }
    while(j<m && totalMin+b[j]<=k){
      totalMin+=b[j];
      j++;
    }
    max=i;
    i--;
    for(;i>=0;i--){
      totalMin-=a[i];
      while(j<m && totalMin+b[j]<=k){
        totalMin+=b[j];
        j++;
      }
      if(max<=i+j+1)max=i+j+1;

    }
    System.out.println(""+max);
  }
}