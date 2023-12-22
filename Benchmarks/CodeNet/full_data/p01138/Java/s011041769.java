import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			else calc(n);
		}
	}
	public void calc(int n){
		int t = 24 * 60 * 60 + 1;
		int[] time = new int[t];
		for(int i = 0; i < n; i++){
			String Dep = sc.next();
			String[] Deps = Dep.split(":");
			int d = Integer.valueOf(Deps[0]) * 60 * 60 + Integer.valueOf(Deps[1]) * 60 + Integer.valueOf(Deps[2]);
			time[d] = time[d] + 1;
			
			String Out = sc.next();
			String[] Outs = Out.split(":");
			int o = Integer.valueOf(Outs[0]) * 60 * 60 + Integer.valueOf(Outs[1]) * 60 + Integer.valueOf(Outs[2]);
			time[o] = time[o] - 1;
		}
		
		int max = 0;
		for(int i = 1; i < t; i++){
			time[i] = time[i] + time[i-1];
			if(max < time[i]) {
				max = time[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}