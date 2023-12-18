import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sockets = in.nextInt();
		int total_req = in.nextInt();	
		int mid = total_req-sockets;
		int total = mid/(sockets-1);
		total++;
		System.out.println(total);
		

	}

}
