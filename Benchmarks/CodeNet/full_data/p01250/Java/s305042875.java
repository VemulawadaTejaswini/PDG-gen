import java.util.Arrays;
import java.util.Scanner;

public class Main{
	double pi = Math.PI;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			double n = sc.nextDouble();
			if(n == 0.0) break;
			
			for(int i = 1;; i++){
				double x = pi * i;
				int [] res = new int[]{(int) Math.floor(x), (int) Math.ceil(x)};
				boolean flg = false;
				for(int j = 0; j < 2; j++){
					double now = Math.abs(pi - ((double)res[j] / i));
					if(now <= n){
						System.out.println(res[j] + "/" + i);
						flg = true;
						break;
					}
				}
				if(flg) break;
			}
		}
	}
	

	public static void main(String[] args) {
		new Main().doit();
	}
}