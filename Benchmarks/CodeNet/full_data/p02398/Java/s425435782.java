import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int count = 0;
		
		do{
			if(c % a == 0){
				count++;
			}
			a++;
		}while(a != b+1);
		System.out.println(count);
		
		scanner.close();
	}
		
}