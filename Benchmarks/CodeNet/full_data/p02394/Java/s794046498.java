import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int	W = scan.nextInt();
		int	H = scan.nextInt();
		int	x = scan.nextInt();
		int	y = scan.nextInt();
		int	r = scan.nextInt();
		
		if(x-r>=0 && x+y<=W){
			System.out.println("Yes");
		} else if (x-r<0 || x+r>W){
			System.out.println("No");
		}
	}
}