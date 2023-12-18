import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int ans=a[n]-a[0];
    for(int i=0;i<n;i++){
      int b=0;
      int c=0;
      for(int j=0;j<i;j++){
        b+=a[j];
      }
      for(int j=i;j<n;j++){
        c+=a[j];
      }
      if(c-b<ans){
        ans=c-b;
      }
    }
    System.out.println(ans);
  }
}
