import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	int[] f = new int[123456 * 2];
	public void run() {
		furui();
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			else calc(n);
		}
	}
	public void calc(int n){
		int sum = 0;
		for(int i = n + 1; i < n * 2 + 1; i++){
			sum = sum + f[i];
		}
		System.out.println(sum);
	}
	public void furui(){
		Arrays.fill(f, 1);
		f[0] = 0;
		f[1] = 0;
		for(int i = 2; i < f.length; i++){
			if(f[i] == 1){
				for(int j = i * 2; j < f.length; j = j + i){
					f[j] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}