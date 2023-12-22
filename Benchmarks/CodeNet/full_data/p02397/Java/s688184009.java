import java.util.*;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a ,b;
		int count = 0;
		while(true){
			a = scanner.nextInt();
			b = scanner.nextInt();
			if(a == 0 && b == 0){break;}
			if(a > b){
				System.out.print("\n"+a + " " + b);
			}
			else{
				System.out.print("\n"+b + " " + a);
			}
				
		}
		scanner.close();
		
		
	}

}