import java.util.Scanner;
public class main {
	private static Scanner input;
	public static void main(String[] args){
		int i;
		input = new Scanner(System.in);
		int n = input.nextInt();
		if(n>=3 && n<=10000){
			for(i=3;i<=n;i++){
				if(i%3==0 || i%10-3==0){
					System.out.print(" "+i);
				}	
				else{
					if(i/1000==3){
						System.out.print(" "+i);
					}
					else if(i/100==3){
						System.out.print(" "+i);
					}
					else if(i/10==3){
						System.out.print(" "+i);
					}
				}	
			}
		}
	}
}