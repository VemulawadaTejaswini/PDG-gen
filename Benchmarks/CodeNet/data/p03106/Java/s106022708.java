import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		int c = Math.min(a, b);
		int cnt =0;
		for(int i = 1; i <= c; i++) {
			if(cnt == k) {
				break;
			}else if(a % i == 0 && b % i == 0){
				cnt++;		
			}else {
				continue;
			}
		}
		System.out.println(cnt);
	}

}