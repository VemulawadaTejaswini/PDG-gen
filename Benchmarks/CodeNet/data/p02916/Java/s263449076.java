import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt()-1;
    }
    int[] b=new int[n];
    for(int i=0;i<n;i++){
      b[i]=sc.nextInt();
    }
    int[] c=new int[n-1];
    for(int i=0;i<n-1;i++){
      c[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
      sum+=b[a[i]];
      if(a[i]==a[i-1]+1){
        sum+=c[a[i]];
      }
    }
    System.out.println(sum);
  }
}