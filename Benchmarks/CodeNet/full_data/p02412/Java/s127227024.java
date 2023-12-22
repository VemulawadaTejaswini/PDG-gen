import java.util.Scanner;

class Main {

	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int n = 0, x = 0;

		while(true){
			int sum = 0;
			n = scan.nextInt();
			x = scan.nextInt();
			if(n == 0 && x == 0)break;
			
			for(int i = 1; i <= n - 2; i++){
				for(int j = i + 1; j <= n - 1; j++){
					for(int k = j + 1; k <= n; k ++){
						if(i + j + k == x){
							sum++;
						}
					}
				}
			}
			System.out.println(sum);
			
		}
		
	}
}	