import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int H = stdIn.nextInt();
		int A = stdIn.nextInt();
		int i=0;
		while(H>0) {
			H -= A;
			i++;
		}
		System.out.println(i);
	}
}
