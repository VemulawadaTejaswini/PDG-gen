import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in) ;

		int[] xList = new int[5];

		for(int i=0;i<5;i++) {
			int x = n.nextInt();
			xList[i] = x;
		}

		for(int i=0;i<5;i++) {
			if(xList[i] == 0) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
