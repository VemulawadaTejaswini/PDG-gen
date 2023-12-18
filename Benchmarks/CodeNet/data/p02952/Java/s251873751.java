import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int cnt = 0;
		for(int i = 1;i <= N;i++){
			if((i <= 9) || (i >= 100 && i < 1000) || (i >= 10000 && i < 100000)){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}