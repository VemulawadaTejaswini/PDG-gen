import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		long r = seer.nextInt();
		long d = seer.nextInt();
		long x = seer.nextInt();
		for(int i = 1; i <= 10; i++){
			x = r*x - d;
			System.out.println(x);
		}
	}

}
