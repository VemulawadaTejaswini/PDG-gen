import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = Integer.parseInt(s.next());
		int b = Integer.parseInt(s.next());
		int c = Integer.parseInt(s.next());
		int counter = 0;
		
		while(true){
			 
			if(a>b){
				 break;
			 }
			
			if(c%a == 0){
				counter++;
			}
			a++;
			
			
		}
		
		System.out.println(counter);
	}

}