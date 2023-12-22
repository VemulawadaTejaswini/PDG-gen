import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		
		for(int i=1; i*i<=X; i++) {
			if(X%i==0) {
				for(long A=0; A<300; A++) {
					long B = A-i;
					if(Math.abs(B)>=300)
						continue;
					long ans = A*A*A*A*A + B*B*B*B*B;
					if(ans == X) {
						System.out.println(A + " " + B);
						sc.close();
						return;
					} else if(B>0 && ans > X) {
						break;
					}
				}
			}
		}
		
		sc.close();
	}
}
