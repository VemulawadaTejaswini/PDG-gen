import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=0;
		
		if (a==0){
			System.out.println(b);
		}
		else if (a==1){
			System.out.println(b*100);
		}
		else {
			System.out.println(b*10000);			
		}
		
	}

}
