import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a==0){
			System.out.println(b);
		}
		else if (a==1){
			System.out.println(b*100);
		}
		else if (a==2){
			System.out.println(b*10000);			
		}
		
	}

}
