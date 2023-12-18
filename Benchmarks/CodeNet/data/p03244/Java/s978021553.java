import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] od = new int[n/2];
		int[] ev = new int[n/2];
		for(int i=0; i<n/2; i++){
			od[i] = sc.nextInt();
			ev[i] = sc.nextInt();
		}
		Arrays.sort(od);
		Arrays.sort(ev);
		int omax = 0;
		int max = 0;
		int[] odnum = new int[n/2];
		for(int i=1; i<n/2; i++){
			int num = 1;
			while(od[i]==od[i-1]){
				num++;
				i++;
				if(i>=n/2)break;
			}
			max = Math.max(max, num);
			if(max==num)omax = od[i-1];
			odnum[i-1] = num;
		}
		Arrays.sort(odnum);

		int emax = 0;
		max = 0;
		int[] evnum = new int[n/2];
		for(int i=1; i<n/2; i++){
			int num = 1;
			while(ev[i]==ev[i-1]){
				num++;
				i++;
				if(i>=n/2)break;
			}
			max = Math.max(max, num);
			if(max==num)emax = ev[i-1];
			evnum[i-1] = num;
		}
		Arrays.sort(evnum);

		int ans = 0;
		if(omax!=emax){
			ans = n - odnum[n/2-1] - evnum[n/2-1];
		}
		else{
			ans = Math.max(n - odnum[n/2-1] - evnum[n/2-2], n - odnum[n/2-2] - evnum[n/2-1]);
		}
		System.out.println(ans);
	}
}