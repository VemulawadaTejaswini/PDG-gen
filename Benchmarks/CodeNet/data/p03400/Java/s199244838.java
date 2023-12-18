import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int d = sc.nextInt();
      int x = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i<n;i++)a[i] = sc.nextInt();
      int[] count = new int[n];
      int sum = 0;
      d--;
      int d0 = d;
      for(int i = 0;i < n;i++){
      	while(d>=0){
      		count[i]++;
        	d -= a[i];
      	}
        sum += count[i];
        d = d0;
      }
      System.out.println(sum+x);
    }
}