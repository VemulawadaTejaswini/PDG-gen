import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int r = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		
		int past = x;;
		for(int i=1;i<=10;i++){
			past = past*r - d;
			
			System.out.println(past);
			
		}
		
		
		
	}
}