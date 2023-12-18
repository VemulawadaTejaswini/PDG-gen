import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums[] = {105, 135, 165, 189, 195};
		int ans = 0;

		for(int i=0; i<5; i++){
			if(nums[i]<=n){
				ans++;
			}
		}
		System.out.println(ans);
	}
}