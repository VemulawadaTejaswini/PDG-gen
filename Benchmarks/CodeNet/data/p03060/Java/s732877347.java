import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 

		int N = keyboard.nextInt();
		
		int[] X = new int[N];
			for(int i=0; i < N; i++) {
				X[i] = keyboard.nextInt();
			}
		int[] Y = new int[N];
			for(int j=0; j < N; j++) {
				Y[j] = keyboard.nextInt();
			}
			
		int[] sagaku = new int[N];
		for(int k=0; k < N; k++) {
			sagaku[k] = X[k] - Y[k];
		}
		
		int Max = 0;
		
		for(int l=0; l < N; l++) {	
			if(sagaku[l] + Max > Max) {
				Max += sagaku[l];
				}
		}

		System.out.print(Max);
		keyboard.close();	
	}
}
