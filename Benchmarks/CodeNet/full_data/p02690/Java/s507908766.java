import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = 0;
		int B = 0;
		for(int i=-500; i<500; i++) {
			for(int j=-500; j<500; j++) {
				double c = Math.pow(i, 5)-Math.pow(j, 5);
				if((int)c==X) {
					A = i;
					B = j;
					break;
				}
			}
		}
		System.out.println(A + " " + B);
	}

}