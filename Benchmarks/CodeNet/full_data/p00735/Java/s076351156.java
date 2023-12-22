import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	int[] sosuu = new int[300000];
	public void run() {
		calcSosuu();
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 1) break;
			else calc(n);
		}
	}

	public void calc(int n){
		System.out.print(n + ":");
		for(int i = 0; i < n+1; i++){
			if(sosuu[i] == 1 && n % i == 0){
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}
	public void calcSosuu(){
		sosuu[0] = -1;
		sosuu[1] = -1;
		for(int i = 2; i < 300000; i++){
			if(sosuu[i] == 0 && (i % 7 == 1 || i % 7 == 6)){
				sosuu[i] = 1;
				for(int j = i * 2; j < 300000; j = j + i){
					sosuu[j] = -1;
				}
			}
			else if(sosuu[i] == 0) sosuu[i] = -1;
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}