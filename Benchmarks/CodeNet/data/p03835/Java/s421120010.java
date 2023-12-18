import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System. in);
		int K = sc.nextInt(), S = sc.nextInt(),Z;
		int count = 0;
		for(int i = 0; i <= K; i++) {
			for(int j = 0; j <= K; j++) {
				Z = S - i - j;
				if(Z >= 0 && Z <= K) count++;

				Z = 0;
			}
		}
		System.out.println(count);
	}

}