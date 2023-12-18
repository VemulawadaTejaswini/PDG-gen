import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		
		int min = a;
		
		int numW = 0;
		int numE = 0;
		
		
		for (int i = 1; i < a; i++) {
			if (b.charAt(i) == 'E') numE++;
		}
		
		min = numE;
		
		for (int i = 1; i < a; i++) {
			int count = 0;
			
			if (b.charAt(i-1) == 'W') {
				numW += 1;
			}
			count+= numW;
			
			if(b.charAt(i) == 'E') {
				numE -= 1;
			}
			count+= numE;
			
			if (count < min) min = count;
		}
		
		System.out.println(min);
		
		
	}	
}
