import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			String n = sc.nextLine();
			if(n.equals("#"))break;
			else calc(n);
			
		}
	}
	public void calc(String line){
		int[] retsu = {0, 1, 2, 3, 1, 0, 3, 1, 2, 3};
		int[] dp = new int[2];
		int panel = Integer.valueOf(line.substring(0,1)); 
		for(int i = 1; i < line.length(); i++){
			int nowPanel = Integer.valueOf(line.substring(i, i+1));
			int[] d = new int[2];
			//left
			int t = Integer.MAX_VALUE;
			if(retsu[nowPanel] <= retsu[panel]) t = dp[1];
			d[0] = Math.min(dp[0] + 1, t);
			//right
			int t2 = Integer.MAX_VALUE;
			if(retsu[panel] <= retsu[nowPanel]) t2 = dp[0];
			d[1] = Math.min(t2, dp[1]+1);
			
			panel = nowPanel;
			dp = d;
		}
		System.out.println(Math.min(dp[0], dp[1]));
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}