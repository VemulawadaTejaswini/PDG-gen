import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int H, A;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		
		while(H > 0){
			A = sc.nextInt();
			H -= A;
			cnt++;
		}
		System.out.print(cnt);
	}
}