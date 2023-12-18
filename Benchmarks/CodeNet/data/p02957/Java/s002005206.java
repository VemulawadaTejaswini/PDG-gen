import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if((a-b)%2==0){
			if(a<b){
				System.out.println((b-a)/2+a);
			}else{
				System.out.println((a-b)/2+b);
			}
		}else{
			System.out.println("IMPOSSIBLE");
		}
	}
}