import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ab = sc.nextInt();
		int bc = sc.nextInt();
		int ca = sc.nextInt();
		sc.close();
		if(ab >= bc && ab >= ca) {
			System.out.println(bc*ca/2);
		}else if(bc >= ab && bc >= ca) {
			System.out.println(ab*ca/2);
		}else {
			System.out.println(ab*bc/2);
		}
	}

}
