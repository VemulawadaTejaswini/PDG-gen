import java.util.*;

class Main {
	
	static int north[] = {1,5,2,3,0,4};
	static int east[]  = {3,1,0,5,4,2};
	static int west[]  = {2,1,5,0,4,3};
	static int south[] = {4,0,2,3,5,1};
	static int left[]  = {0,3,1,4,2,5};
	static int right[] = {0,2,4,1,3,5};
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if(n==0) return ;
			int dice[] = {1,2,3,4,5,6};
			int ans = 1;
			for(int i=0; i<n; i++){
				String cmd = in.next();
				dice = change(dice, cmd);
				ans += dice[0];
			}
			System.out.println(ans);
		}
	}
	
	private static int[] change(int[] dice, String dir){
		int ans[] = new int[6];
		if(dir.equals("North")){
			for(int i=0; i<6; i++)
				ans[i] = dice[north[i]];
		}
		else if(dir.equals("East")){
			for(int i=0; i<6; i++)
				ans[i] = dice[east[i]];
		}
		if(dir.equals("West")){
			for(int i=0; i<6; i++)
				ans[i] = dice[west[i]];
		}
		if(dir.equals("South")){
			for(int i=0; i<6; i++)
				ans[i] = dice[south[i]];
		}
		if(dir.equals("Right")){
			for(int i=0; i<6; i++)
				ans[i] = dice[right[i]];
		}
		if(dir.equals("Left")){
			for(int i=0; i<6; i++)
				ans[i] = dice[left[i]];
		}
		return ans;
	}
}