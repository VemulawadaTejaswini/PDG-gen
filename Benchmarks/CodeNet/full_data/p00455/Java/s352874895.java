import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(int rept=0; rept<3; rept++){
			int come = toSec(in.nextInt(), in.nextInt(), in.nextInt());
			int out  = toSec(in.nextInt(), in.nextInt(), in.nextInt());
			int ans[] = toDate(out - come);
			System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
		}
		return ;
	}
	
	static int toSec(int h, int m, int s){
		return h*60*60 + m*60 + s;
	}
	
	static int[] toDate(int sec){
		int ret[] = new int[3];
		ret[0] = sec/3600;
		ret[1] = (sec%3600)/60;
		ret[2] = sec%60;
		return ret;
	}
	
}