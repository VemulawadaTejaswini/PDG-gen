import java.util.Scanner;

public class Main {
	
	
	public static final int SIZE = 8;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long num = 0;
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			num += sc.nextInt();
		}
		
		System.out.println(num / n);
	}
	
}