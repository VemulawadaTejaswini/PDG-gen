import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		char[][] C = new char[2][3];
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();

		C[0][0] = a.charAt(0);
		C[0][1] = a.charAt(1);
		C[0][2] = a.charAt(2);
		C[1][0] = b.charAt(0);
		C[1][1] = b.charAt(1);
		C[1][2] = b.charAt(2);

		if(C[0][0]==C[1][2]&&C[0][1]==C[1][1]&&C[0][2]==C[1][0]&&C[1][0]==C[0][2]&&C[1][1]==C[0][1]&&C[1][2]==C[0][0]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
