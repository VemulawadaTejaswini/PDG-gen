import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int min = 0;
		for(int i = 1;i < Math.sqrt(N);i++){
			if(N % i == 0) min = i;
		}

		System.out.println(min - 1 + N/min - 1);
	}
}





