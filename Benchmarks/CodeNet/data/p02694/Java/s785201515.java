import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long X = Long.parseLong(scan.nextLine());
		long P = 100;
		int cnt = 0;

		for (int i = 0; i < 3800; i++){
			if (X > P){
				P += P / 100;
				cnt++;
			}else {
				System.out.println(cnt);
				return;
			}
		}
	}
}
