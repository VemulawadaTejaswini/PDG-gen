import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int i; 
		int n = scan.nextInt();
		
		for(i=1; i<=n; i++){
			if(i%3 == 0){
				System.out.print(" "+i);
			}else if(i%10 == 3){
				System.out.print(" "+i);
			}else if(i%100/10 == 3){
				System.out.print(" "+i);
			}else if(i%1000/100/10 == 3){
				System.out.print(" "+i);
			}else if(i%10000/1000/100/10 == 3){
				System.out.print(" "+i);
			}
			
		}
		System.out.println();
	}
}