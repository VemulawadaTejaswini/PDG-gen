
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long x = sc.nextInt();
		long y = sc.nextInt();
		
		if(c+c > a+b){
			System.out.println(a*x+y*b);
		}else{
			if(x < y){
				
				if(c+c < b){
					System.out.println(2* c * y);
				}else{
					System.out.println(2*c*x+ b * (y-x));
				}
			}else{
				
				if(c+c < a){
					System.out.println(2*c*x);
				}else{
					System.out.println(2*c*y + a *(x- y)  );
				}
			}
		}
	}
}
