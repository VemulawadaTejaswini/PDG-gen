
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int i = 2;
		System.out.print(n+":");
		for(int j=2;j<=31622;j++){
			if(n%j==0){
				break;
			}
			if(j==31622){
				System.out.println(" "+n);
				return;
			}
		}
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
		System.out.println();
	}

}