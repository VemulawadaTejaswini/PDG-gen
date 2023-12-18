import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[5];
		int amari = 1000;
		int ans = 0;
		for(int i = 0; i < 5; i++) {
			A[i] = sc.nextInt();
			if(A[i] % 10 != 0) {
				amari = Math.min(A[i] % 10, amari);
				A[i] += 10 - A[i] % 10;
			}			
		}
		for(int i = 0; i < 5; i++) {
			ans += A[i];
		}
		if(ans != 1000)
			ans += amari - 10;
		System.out.println(ans);

	}

}