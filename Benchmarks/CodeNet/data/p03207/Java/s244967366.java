import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] items = new int[n];
		for(int i=0; i<n; i++){
			items[i] = sc.nextInt();
			ans += items[i];
		}
		
		int max = 0;
		for(int i=0; i<n; i++){
			if(items[i] > max){
				max = items[i];
			}
		}
		
		ans -= max / 2;
		System.out.println(ans);
	}
}