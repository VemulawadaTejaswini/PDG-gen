import java.util.*;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int gcd, lcm;
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int a2 = a;
			int b2 = b;
			
			while(true){
				if(a2 == b2) break;
				if(a2 > b2){
					a2 -= b2;
				}else{
					b2 -= a2;
				}
			}
				
				gcd = a2;
				lcm = a * b / gcd;
				
				System.out.println(gcd+" "+lcm);
		}
	}
}