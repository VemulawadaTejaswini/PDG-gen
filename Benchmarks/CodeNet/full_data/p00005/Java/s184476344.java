import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		while(sc.hasNext()){
			long a, ta, b, tb, gcd, lcm;
			a = ta = sc.nextLong();
			b = tb = sc.nextLong();
			gcd = lcm = 1;
			
			int d = 2;
			
			
			while(true){
				if(ta / d == 0 || tb / d == 0)
					break;
				
				if(ta % d == 0 && tb % d == 0){
					gcd *= d;
					ta /= d;
					tb /= d;
				}else{
					d++;
				}
			}
			
			lcm = a * b / gcd;
			
			System.out.printf("%d %d\n", gcd, lcm);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}