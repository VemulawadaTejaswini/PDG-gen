import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] lens = new int[n];
		for(int i=0; i<n; i++){
			lens[i] = sc.nextInt();
		}

		int where = 0;
		int i = 0;
		while(where <= x){
			where += lens[i];
			i++;
			if(i >= n){
				break;
			}
		}
		
		ans = i;
		System.out.println(ans);
	}
}
