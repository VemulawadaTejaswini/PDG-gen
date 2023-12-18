import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String list[] = new String[N];
		
		for(int n = 1; n <= N; n++){
			list[n-1] = scanner.next();
		}
		
		scanner.close();
		
		for(int n = 1; n <= N; n++){
			for(int m = 1; m <= N; m++){

				if(n != m && list[n-1].equals(list[m-1])){
					System.out.println("No");
					return;
				}
			}
		}
		
		for(int n = 1; n <= N-1; n++){
			String head = list[n].substring(0,1);
			String tail = list[n-1].substring(list[n-1].length()-1);
			
			if(!head.equals(tail)){
				System.out.println("No");
				return;
			}	
		}
		
		System.out.println("Yes");
	}
}
