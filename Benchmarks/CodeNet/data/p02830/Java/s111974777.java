import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		String t = sc.next();
		String buff = "";

		for(int i =0;i<n;i++) {
			buff = buff + s.substring(i,i+1)+t.substring(i,i+1);
		}

		System.out.println(buff);


	}

}
