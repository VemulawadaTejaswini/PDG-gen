
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for(int i = 1; i<=number; i++){
			int x = i;
			if(x%3==0){
				System.out.print(" "+i);
			}else if(x % 10 == 3){
				System.out.print(" "+i);
			}else{
				while(true){
				if(x%10==3){
					System.out.print(" "+i);
					break;
			}
			x = x/10;
			if(x==0){
				break;
			}
			}
			}
		}
		System.out.println();
	    }
	}
 
