import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long ans = 1;

		for(int i = 0; i < n; i++){
			long s = sc.nextLong();
			ans *= s;
		}
		if(ans > 1e18)
			System.out.println(-1);
		else
			System.out.println(ans);
        sc.close();
	}

}
