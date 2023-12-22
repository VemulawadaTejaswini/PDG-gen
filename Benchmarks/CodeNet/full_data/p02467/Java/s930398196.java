
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int i = 2;
		System.out.print(n+":");
		while(true){
			if(n%i==0){
				System.out.print(" "+i);
				n = n / i;
			}
			else{
				i++;
			}
			
			if(n==1){
				break;
			}
		}
	}

}