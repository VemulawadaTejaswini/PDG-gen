import java.util.Scanner;

public class Main {

	int[] S = new int[10000];
	int[] T = new int[500];
	int n;
	int q;
	int count = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		
		main.n = scan.nextInt();
		
		for (int i = 0;i < main.n;i++){
			main.S[i] = scan.nextInt();
		}
		
		main.q = scan.nextInt();
		
		for (int i = 0;i < main.q ;i++){
			main.T[i] = scan.nextInt();
		}
	
		for (int i = 0;i < main.n;i++){
			for(int j = 0;j < main.q;j++){
				
				if (main.T[i] == main.S[j]){
					 main.count += 1; 
				}
			}
		}
		

		System.out.println(main.count);
	}

}