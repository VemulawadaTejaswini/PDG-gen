import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		char ans = sc.next().charAt(0);
		if(ans < 'a') {
			System.out.println("A");
		}else{
			System.out.println("a");
		}
	}
}


