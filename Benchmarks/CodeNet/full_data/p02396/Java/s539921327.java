import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		for(;;){
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			System.out.println("Case " + i + ": " + a);
			i++;
			if(a==0)break;
		}
		

	}

}