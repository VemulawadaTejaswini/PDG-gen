import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int ren;
		switch (s) {
		case "RRR":
			ren = 3;
			break;
		case "RRS":
		case "SRR":
			ren = 2;
			break;
		case "SSS":
			ren = 0;
			break;
		default:
			ren = 1;
			break;
		}
		
		System.out.println(ren);
		sc.close();
	}
}


