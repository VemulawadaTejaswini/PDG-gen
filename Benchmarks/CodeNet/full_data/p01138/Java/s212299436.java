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
		int[] kiroku = new int[n];
		for(int i = 0; i < n; i++){
			String d = sc.next();
			String[] ds = d.split(":");			
			int Dep = Integer.valueOf(ds[0]) * 10000 + Integer.valueOf(ds[1]) * 100 + Integer.valueOf(ds[2]);
			
			String d2 = sc.next();
			String[] ds2 = d2.split(":");	
			int Out = Integer.valueOf(ds2[0]) * 10000 + Integer.valueOf(ds2[1]) * 100 + Integer.valueOf(ds2[2]);
			
			for(int j = 0; j < n; j++){
				if(kiroku[j] == 0){
					kiroku[j] = Out;
					break;
				}
				else if(kiroku[j] <= Dep){
					kiroku[j] = Out;
					break;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < n; i++){
			if(kiroku[i] == 0) break;
			else sum++;
		}
		System.out.println(sum);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}