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
    while(totalMin+a[i]<=k && i<n){
      totalMin+=a[i];
      i++;
    }
    max=i;
    i--;
    
    for(;i>=0;i--){
      totalMin-=a[i];
      while(totalMin+b[j]<=k){
        totalMin+=b[j];
        j++;
      }
      if(max<=i+j)max=i+j+1;

    }
    System.out.println(""+max);
  }
}