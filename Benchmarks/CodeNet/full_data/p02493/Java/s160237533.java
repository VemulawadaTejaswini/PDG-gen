import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		if(100 < n || n <= 0){
			System.out.println("不正な入力です");
			System.exit(0);
		}
		
		String[] stringSequence = new String[n];
		for(int i = 0; i < n; i++){
			stringSequence[i] = sc.next();
		}
		
		for(int i = n - 1; i >= 0; i--){
			switch(i){
			case 0:
				System.out.printf("%s\n", stringSequence[i]);
				break;
			default:	
				System.out.printf("%s ", stringSequence[i]);
				break;
			}
		}
	}
}