import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] h = sc.nextInt();
      int min = 1000000000;
      for(int i = 0;i < n;i++)h[i] = sc.nextInt();
      Arrays.sort(h);
      for(int i = 0;i <= n-k;i++){
      	min = Math.min(min,h[i+k-1]-h[i]);
      }
      System.out.println(min);
    }
}