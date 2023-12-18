
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++){
			a[i] = input.nextInt();
		}
		input.close();
		int count = 0;
		for(int i = 0; i < N; i++){
			for(int j = i+1; j < N; j++){
				int xor = a[i]^a[j];
				if(xor == a[j-1] || xor == a[j]){
					count++;
					break;
				}else{
					for(int k = j+1; k < N; k++){
						if(xor == a[k]){
							count++;
							break;
						}
					}
				}
			}
		}
		
		if(count == N-1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
