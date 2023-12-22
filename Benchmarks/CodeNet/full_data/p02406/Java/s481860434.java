import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		for(i = 1; i <= n; ++i){
			if(i % 3 == 0){
				System.out.print(" "+i);
				}
			else if(i % 10 == 3){
				System.out.print(" "+i);
			}
			else if(i % 100 >= 30 && i % 100 < 40){
				System.out.print(" "+i);
			}
			else if(i % 1000 >= 300 && i % 1000 < 400){
				System.out.print(" "+i);
			}
			else if(i % 10000 >= 3000 && i % 10000 < 4000){
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
}