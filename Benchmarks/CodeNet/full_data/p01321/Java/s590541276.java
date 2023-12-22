import java.util.*;

public class Main {

	void run(){
		Scanner in = new Scanner(System.in);
		for(int n = in.nextInt(); n > 0; n = in.nextInt()){
			int ma = Integer.MIN_VALUE, mi = Integer.MAX_VALUE;
			for(int i=0; i<n; i++){
				int sum = 0;
				for(int j=0; j<5; j++){
					sum += in.nextInt();
				}
				ma = Math.max(ma, sum);
				mi = Math.min(mi, sum);
			}
			System.out.println(ma + " " + mi);
		}
	}


	public static void main(String args[]){
		new Main().run();
	}
}