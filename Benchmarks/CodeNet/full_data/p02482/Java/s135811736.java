import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a==b){
			System.out.println("a==b");
		}else if(a<b){
			System.out.println("a<b");
		}else{
			System.out.println("a>b");
		}
	}
}