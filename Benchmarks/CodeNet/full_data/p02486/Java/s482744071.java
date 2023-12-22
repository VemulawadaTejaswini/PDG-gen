import java.util.Scanner;
class Main {
	public static void main(String[] args){
		int n, x, count;
		Scanner scn = new Scanner(System.in);
		
		while (true){
			count = 0;
			n = scn.nextInt();
			x = scn.nextInt();
			if (n == 0 && x == 0) break;
			
			for (int i = 1; i <= n; i++){
				for (int j = i; j <= n; j++){
					for (int k = j; k <= n; k++){
						if (i + j + k == x && i != j && j != k && k != i){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
		scn.close();
	}
}