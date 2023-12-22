import java.util.Scanner;

public class Main {

	final static int MAX = 24 * 60 * 60;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();

			if(n == 0){
				break;
			}
			
			final int m = sc.nextInt();
			
			int[] prices = new int[n];
			char[][] inputs = new char[n][];
			
			for(int i = 0; i < n; i++){
				inputs[i] = sc.next().toCharArray();
				prices[i] = sc.nextInt();
			}
			
			int sum = 0;
			for(int i = 0; i < m; i++){
				char[] str = sc.next().toCharArray();
				
				for(int j = 0; j < n; j++){
					boolean found = true;
					
					for(int k = 0; k < inputs[j].length; k++){
						if(inputs[j][k] == '*'){
							continue;
						}else if(inputs[j][k] != str[k]){
							found = false;
							break;
						}
					}
					
					if(found){
						sum += prices[j];
						break;
					}
				}	
			}
			
			System.out.println(sum);
			
		}

	}

}