import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] cnt = new int[200005];
		for(int i=0;i<n;i++){
			cnt[sc.nextInt()]++;
		}
		
		Arrays.sort(cnt);
		
		int r = 0;
		for(int i=cnt.length-1-k;i>=0;i--){
			if(cnt[i]!=0)
				r+=cnt[i];
			else
				break;
		}
		
		System.out.println(r);
	}

}
