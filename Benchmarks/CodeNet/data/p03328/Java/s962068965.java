import java.util.Scanner;

public class Main {
	public static int maxDepth;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int diff = b - a;
		
		int towA = 1;
		int towB = 3;
		while(true) {
			int tmp = towB - towA;
			if(tmp == diff) {
				System.out.println(towB-b);
				break;
			}
			towA = towB;
			towB = towB + tmp+1;
			
			
				
				
		}
	}
}

