import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      Arrays.sort(a);
      int cnt = 0;
      while(x>=0&&cnt<=n-1){
      	x-=a[cnt];
        cnt++;
      }
      if(x>0)System.out.println(n);
      else System.out.println(cnt-1);
    }
}
