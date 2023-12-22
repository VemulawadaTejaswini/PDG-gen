import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Long k = Long.parseLong(sc.next());
		int[] town = new int[n]; 
		boolean[] town_flag = new boolean[n];
		town_flag[0] = true;
		for(int i = 0 ; i < n ; i++) {
			town[i] = Integer.parseInt(sc.next());
		}
		int looppoint = 0;
		int cnt1 = 0;
		while(true) {
			if(town_flag[town[cnt1]-1]) {
				looppoint = town[cnt1]-1;
				break;
			}
			town_flag[town[cnt1]-1] = true;
			cnt1++;
		}
		
		int pos = looppoint;
		int cnt2 = 0;
		while(true) {
			cnt2++;
			if(looppoint == town[pos]-1) {
				break;
			}
			pos = town[pos] -1;
	
		}
		
		if(k > cnt1) {
			k = k%cnt2 + cnt1;
		}
		pos = 0;
		while(k!=0) {
			pos = town[pos] -1;
			k--;
		}
		
		System.out.println(pos+1);
	}
}
