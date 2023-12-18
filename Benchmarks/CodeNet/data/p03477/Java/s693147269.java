import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] libra = new int[4];
		for(int i=0; i<libra.length; i++){
			libra[i] = sc.nextInt();
		};
		int left = libra[0] + libra[1];
		int right = libra[2] + libra[3];
		if(left == right) {
			System.out.println("Balanced");
		} else if(left > right) {
			System.out.println("Left");
		} else {
			System.out.println("Right");
		}
	}
}
