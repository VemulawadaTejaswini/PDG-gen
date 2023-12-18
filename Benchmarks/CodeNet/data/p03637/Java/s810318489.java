import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int multTwo = 0;
		boolean val = false;
		for(int i = 0; i < N; i++){
			int num = input.nextInt();
			if(num % 4 ==0){
				System.out.println("Yes");
				val = true;
				break;
			}
			else if(num % 2 == 0){
				multTwo++;
				if(multTwo == 2){
					System.out.println("Yes");
					val = true;
					break;
				}
			}
		}
		
		if(val == false){
			System.out.println("No");
		}
	}
}
