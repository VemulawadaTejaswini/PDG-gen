import java.util.Scanner;
public class Main {

	static long Factrial(int num) {
		if(num == 1)
			return(1);
		else {
			return(num * Factrial(num - 1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		
		System.out.println(Factrial(num));
	}

}