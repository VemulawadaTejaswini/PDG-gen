import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int intA = sc.nextInt();
		int intB = sc.nextInt();
		int intC = sc.nextInt();

		if(intA < intB){
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