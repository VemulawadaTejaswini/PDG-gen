import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long num=1;
		for(int i=0;i<N;i++) {
			num*=sc.nextLong();
		}
		sc.close();
		if (num>(long)Math.pow(10,18)) 
			System.out.println(-1);
		else
			System.out.println(num);
	}
}
