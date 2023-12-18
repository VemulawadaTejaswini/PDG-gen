import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      	int N = reader.nextInt();
      	int[] prices = new int[N];
        prices[0] = reader.nextInt();
      	int max = 0;
      	for (int i = 1; i < N;i++) {
        	prices[i] = reader.nextInt();
          	if (prices[i] > prices[max]) {
            	max = i;
            }
        }
      prices[max] /= 2;
      int result = 0;
      for (int j = 0; j < N;j++) {
        result += prices[j];
        	
        } 
      System.out.print(result);
		
    }
}