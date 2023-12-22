import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()) {
			int num = stdIn.nextInt();
			for(int r = 0; r < 10; r++) {
				if(((num >> r) & 1) == 1) {
					int pow = (int)Math.pow(2, r);
					if(num - pow < 0) break;
					System.out.print(pow);
					if(r != 9) System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}