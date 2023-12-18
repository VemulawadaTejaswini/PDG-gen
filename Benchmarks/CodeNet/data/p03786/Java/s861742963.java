import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n+1];
      for(int i = 1;i <= n;i++)a[i]=sc.nextInt();
      Arrays.sort(a);
      int[] sum = new int[n+1];
      int cnt = 1;
      for(int i = 1;i <= n;i++)sum[i]=sum[i-1]+a[i];
      for(int i = n;i>=2;i--){
      	if(a[i]<=sum[i-1]*2)cnt++;
        else break;
      }
      System.out.println(cnt);
    }
}