
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


class Main {

	public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int p = 0;
        int bp1 = 0;
        int bp2 = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int N;
        N = stdIn.nextInt();

        int[] A = new int[N]; 
        int[] B = new int[N];
        int[] C = new int[N];

        for(i = 0; i < N; i++){
            A[i] = stdIn.nextInt();
        }
        for(i = 0; i < N; i++){
            B[i] = stdIn.nextInt();
        }
        for(i = 0; i < N; i++){
            C[i] = stdIn.nextInt();
        }

        Arrays.sort(A);        
        Arrays.sort(B);     
        Arrays.sort(C);     

        for(i = N-1; i > -1; i--){
            j = bp1;
            for(j = N-1; j > -1; j--){
                if(A[i] > B[j]) {
                    bp1 = j;
                    break;
                }
                k = bp2;
                for(k = N-1; k > -1; k--){
                    if(B[j] > C[k]){
                        bp2 = k;
                        break;
                    }
                    p++;
                }    
            }
        }
        System.out.println(p);
	}
}
