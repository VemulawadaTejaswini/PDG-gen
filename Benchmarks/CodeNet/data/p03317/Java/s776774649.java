import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		int k = seer.nextInt();
		for(int i = 0; i < n; i++){
			seer.nextInt();
		}
		System.out.println((int)Math.ceil((n-1)*1.0/(k-1)));
	}
}
