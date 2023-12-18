import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];

		for(int i=0; i<n; i++){
			int b = sc.nextInt();
			h[i] = t - b*0.006;
		}

		int min = 110;
		int ans;
		for(int i=0; i<n; i++){
			int x;
			if(h[i] >= a){
				x = h[i]-a;
			}else{
				x = a - h[i];
			}
			if(x <= min){
				ans = i;
			}
		}
		System.out.println(ans+1);



	}
}