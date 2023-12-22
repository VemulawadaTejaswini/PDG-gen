import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a  = number.nextInt();
		int[] b = new int[a];
		int c = 0,max = 0;
		double d;

		for(int i = 0;i < a;i++) {
			b[i] = number.nextInt();
			for(int j = 0;j < i;j++) {
				if(i != j) {
					if(i == 1 || max < b[i] - b[j]) max = b[i] - b[j];
				}
			}
			
		}
		System.out.println(max);
	}
}

