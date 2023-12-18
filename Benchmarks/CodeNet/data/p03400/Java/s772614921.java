import java.util.*;

public class Main{
   public static void main(String[] args){
          Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          int day=in.nextInt();
          int x=in.nextInt();
          int ans=x+n;
          int[] a=new int[n];
          for(int i=0;i<n;i++){
          a[i]=in.nextInt();
          ans+=(day-1)/a[i];
          }
  System.out.println(ans);
}
}