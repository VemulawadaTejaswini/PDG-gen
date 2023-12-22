import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);

		int intA = scan.nextInt();
		int intB = scan.nextInt();
		int intC = scan.nextInt();

		if(intA < intB ){
			
			if(intB < intC){
				System.out.println("Yes");
			}else{				
				System.out.println("No");
			}
		
		}else{
			
			System.out.println("No");
		} 
			
		
			

	}

}