import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	int K = input.nextInt();
      	int[] X = new int[N];
      	int smallGap;
      
      	for (int i = 0; i < N; i++) {
        	X[i] = input.nextInt();
        }
      
      	
		if (X[0] < 0) {
         	smallGap = X[N - 1] - (X[0] * 2);
        } else {
        	smallGap = X[N - 1];
        }

      	for (int i = 0; i < N - K; i++) {
        	int min = X[i];
          	int max = X[i + K - 1];
          	int gap;
          	if (min < 0) {
            	gap = max - min;
              	gap += 0 - min;
            } else {
              	gap = max;
            }
          	if (gap < smallGap) {
              	smallGap = gap;
            }
        }
      
      System.out.print(smallGap);

    }
}