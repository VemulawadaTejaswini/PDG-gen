import java.util.*;

public class Main{
  public static void mai(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int sum=0;
    for(int i=0;i<k;i++){
      sum+=a[n-i-1];
    }
    System.out.println(sum);
  }
}