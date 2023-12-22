import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a  = number.nextInt();
		int[] b = new int[a];
		int c = 0;;

		for(int i = 0;i < a;i++) {
			b[i] = number.nextInt();
			c++;
			for(int j =2;j < b[i];j++) {
				
				if(b[i] % j == 0) {
					
					c--;
					break;
				}
			}
			
		}
		System.out.println(c);
	}
}

