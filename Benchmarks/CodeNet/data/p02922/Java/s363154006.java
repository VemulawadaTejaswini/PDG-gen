import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sockets = in.nextInt();
		int total_req = in.nextInt();
		for(int i = 1;i<total_req;i++) {
			if(sockets*i>=total_req) {
				System.out.println(i);
				break;
			}
		}

	}

}
