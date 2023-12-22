import java.util.*;
class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
        int[] A = new int[N];

			for (int w = 0; w < N ; w++){
				A[w] = sc.nextInt();

			}
        int sum = 0;

      for (int i = 0; i <= N-2; i++){

        for (int j = i+1; j <= N-1; j++){
      		sum += A[i] * A[j];
					
        }
      }
      System.out.println(sum % (10^9+7));
		    }
 }
