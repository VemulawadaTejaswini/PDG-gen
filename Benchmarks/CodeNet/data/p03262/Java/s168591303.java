import java.util.Arrays;
import java.util.Scanner;

public class contest109c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] input = new int[N];
		int skip = 0;
		boolean coprime = false;
		boolean allEven = false;
		
		for(int a = 0 ; a < N ; a++){
			input[a] = Math.abs(X-(sc.nextInt()));
		}
		sc.close();
		Arrays.sort(input);
		
		if(N == 1){
			skip = input[0];
		}else{
			for(int a = 1 ; a < N ; a++){
				if(input[a] % input[0] != 0){
					coprime = true;
				}
			}
			if(coprime){
				for(int b = 0 ; b < N ; b++){
					if(input[b] % 2 == 0){
						allEven = true;
					}else{
						break;
					}
				}
				skip = allEven ? 2 : 1;
			}else{
				skip = input[0];
			}
		}
		System.out.println(skip);
	}