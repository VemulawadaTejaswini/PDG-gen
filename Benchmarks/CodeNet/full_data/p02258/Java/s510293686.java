import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a  = number.nextInt();
		int[] b = new int[a];
		int c = 0,max = 0,min = 0;
		double d;

		for(int i = 0;i < a;i++) {
			b[i] = number.nextInt();
			
				
				
			if(i == 1 || max < b[i] - min) max = b[i] - min;
			if(i == 0 || b[i] < min) min = b[i];
			
			
		}
		System.out.println(max);
	}
}

