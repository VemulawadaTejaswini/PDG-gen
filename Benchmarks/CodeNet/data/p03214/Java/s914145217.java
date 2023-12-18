import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
      int[] a = new int[N];
      double sum=0;
      for(int i=0;i<N;i++){
       a[i] = sc.nextInt();
       sum+=a[i];
      }
      double ave = sum/N;
      double min =100;
      int ans = 0;
      for(int i=0;i<N;i++){
        if(Math.abs((double)a[i]-ave)<min){
          min=Math.min(Math.abs((double)a[i]-ave),min);
          ans=i;
        }
      }
      	System.out.println(ans);
    }
}