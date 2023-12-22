import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int count = 0;
		while(true){
			a++;
			if(a == b){
				break;
			}else if(c % a == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}