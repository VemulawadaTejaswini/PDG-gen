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
	public void calc(int e){
		int m = e;
		for(int z = 0; z < e + 1; z++){
			if(z*z*z > e) break;
			int e2 = e - z*z*z;
			for(int y = 0; y < e2 + 1; y++){
				if(y*y > e2) break;
				int x = e2 - y*y;
				if(z + y + x < m) m = x + y + z;
			}
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}