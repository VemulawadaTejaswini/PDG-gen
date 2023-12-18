import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      
      	int[] array = new int[N];

      	for(int i = 0; i < N; i++) {
          	array[i] = scanner.nextInt();
            //System.out.println(array[i]);
        }
      	int plus = 0;
      	double sum = 0;
      	for(int j = 0; j < N; j++) {
        	plus = plus + (int) Math.pow(array[j], 2);
          	sum = sum + array[j] * 2;
        }
      	sum = Math.round(sum / (2 * N));
      
      	int ans = 0;
      	for(int k = 0; k < N; k++) {
        	ans = ans + (int) Math.pow((array[k] - (int) sum), 2);
        }
      
     	System.out.println(ans);
      	
	}
}
 

 

