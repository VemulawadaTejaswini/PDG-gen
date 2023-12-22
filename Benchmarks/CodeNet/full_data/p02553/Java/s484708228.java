import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sca01 = new Scanner(System.in);
		long a = sca01.nextInt();
		long b = sca01.nextInt();
		long c = sca01.nextInt();
		long d = sca01.nextInt();

		long maxAB = 0;
		long maxCD = 0;

		if(Math.signum(a) == -1.0 && Math.signum(c) == -1.0){
			maxAB = a;
		}else if(Math.signum(d) == -1.0){
			maxAB = a;
		}else if(a <= b){
			maxAB = b;
		}else {
			maxAB = a;
		}

		if(Math.signum(a) == -1.0 && Math.signum(c) == -1.0){
			maxCD = c;
		}else if(Math.signum(d) == -1.0){
			maxCD = d;
		}else if(c <= d){
			maxCD = d;
		}else {
			maxCD = c;
		}
		System.out.println(maxAB * maxCD);
	}
}
