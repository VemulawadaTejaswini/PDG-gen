
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


class Main {

	public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int p = 0;

        int N;
        N = stdIn.nextInt();

        int[] A = new int[N]; 
        int[] B = new int[N];
        int[] C = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = stdIn.nextInt();
        }
        for(int i = 0; i < N; i++){
            B[i] = stdIn.nextInt();
        }
        for(int i = 0; i < N; i++){
            C[i] = stdIn.nextInt();
        }

        Arrays.sort(A);        
        Arrays.sort(B);     
        Arrays.sort(C);     

        for(int i = N-1; i > -1; i--){
            for(int j = N-1; j > -1; j--){
                if(A[i] > B[j]) break;
                for(int k = N-1; k > -1; k--){
                    if(B[j] > C[k]) break;
                    p++;
                }    
            }
        }

        System.out.println(p);
    
	}
}
