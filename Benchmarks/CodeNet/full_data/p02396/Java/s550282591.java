import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int a = 0;
		while(x>0){
			a++;
			System.out.println("case"+ a +":"+ x);
			if(a>10){
				x = 0;
			}
		}
	}
}

