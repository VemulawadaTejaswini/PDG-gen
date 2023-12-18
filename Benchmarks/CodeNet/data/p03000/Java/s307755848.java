import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] lens = new int[n];
		for(int i=0; i<n; i++){
			lens[i] = sc.nextInt();
		}

		int[] where = new int[n + 1];
		where[0] = 0;
		for(int i=0; i<n; i++){
			where[i + 1] = where[i] + lens[i];
			if(where[i + 1] <= x){
				ans++;
			}
		}

		System.out.println(ans);
	}
}
