import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	int[] sosuu = new int[1000000];
	public void run() {
		calcSosuu();
		while(sc.hasNext()){
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			if(a == 0 && d == 0 && n == 0) break;
			else calc(a,d,n);
		}
	}
	
	public void calc(int a, int d, int n){
		int s = a;
		while(n > 0){
			if(sosuu[s] == 1){
				n--;
				if(n == 0) break;
			}
			s = s + d;
		}
		System.out.println(s);
	}
	
	public void calcSosuu(){
		sosuu[0] = -1;
		sosuu[1] = -1;
		for(int i = 2; i < 1000000; i++){
			if(sosuu[i] == 0){
				sosuu[i] = 1;
				for(int j = i * 2; j < 1000000; j = j + i){
					sosuu[j] = -1;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}