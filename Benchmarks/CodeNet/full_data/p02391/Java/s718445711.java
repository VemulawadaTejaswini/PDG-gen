import java.util.Scanner;

public class Test5 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intA = scan.nextInt();
		int intB = scan.nextInt();
		if(intA < intB){
			System.out.println("A < B");
		}else if(intA > intB){
			System.out.println("A > B");
		}else if(intA == intB){
			System.out.println("a == b");
		}
	}
}