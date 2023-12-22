import java.util.Scanner;


public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0 && a == 0 && b == 0 && c == 0 && x == 0) break;
			else calc(n,a,b,c,x);
		}
	}
	public void calc(int n, int a, int b, int c, int x){
		int count = 0;
		for(int i = 0; i < n; i++){
			int yi = sc.nextInt();
			if(count <= 10000){
				while(true){
					if(i == 0 && yi == x) break;
					else{
						count++;
						int t = a * x + b;
						x = t % c;
						if(x == yi) break;
						else if(count > 10000)	break;
					}
				}
			}
			if(count > 10000) count = -1;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}