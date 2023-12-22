import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		while (true){
			int n = scan.nextInt();
			int x = scan.nextInt();
			
			if (n + x == 0){
				break;
			}
			int cnt = 0;
			
			for (int i = 1; i <= n; i++){
				for (int j = 1; j < i; j++){
					for (int k = 1; k < j; k++){
						if (i + j + k == x){
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}