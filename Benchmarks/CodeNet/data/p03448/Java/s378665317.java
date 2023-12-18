import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X= sc.nextInt();
		int count = 0;
		for(int i = 0;i <= A;i++) {
			for(int k = 0;k <= B;k++) {
				for(int j = 0;j <= C;j++) {
					int ans = (500 * i) + (100 * k) + (50 * j);
					if(ans == X) count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
