import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int Z = Integer.parseInt(sc.next());
		sc.close();

		int ans = 0;
		for(int num = 1; num < 100000; num++) {
			int distance = Y * num +  Z *(num + 1);
			if(distance > X) {
				ans = num - 1;
				break;
			}else if(distance == X){
				ans = num;
				break;
			}else {
				continue;
			}
		}
		System.out.println(ans);
	}

}