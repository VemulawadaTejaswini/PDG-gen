import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		if(7 % K == 0){
			System.out.println(1);
		}
		else if(77 % K == 0){
			System.out.println(2);
		}
		else if(777 % K == 0){
			System.out.println(3);
		}
		else if(7777 % K == 0){
			System.out.println(4);
		}
		else if(77777 % K == 0){
			System.out.println(5);
		}
		else if(777777 % K == 0){
			System.out.println(6);
		}
		else{
			System.out.println(-1);
		}

		stdIn.close();
	}
}