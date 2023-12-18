
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []AN  = new int[N];

        for (int i=0;i<N;i++){
            AN[i]=sc.nextInt();
        }
        boolean borrowed = false;
        long pair = 0;
        for(int i=0;i<N;i++){
            int num = AN[i];
            if (borrowed){
                num--;
                borrowed = false;
            }
            if(num>0){
                pair += Math.ceil(num/2);
            }
            if(num%2==1){
                if(i<N-1){
                    if(AN[i+1]>0){
                        borrowed = true;
                        pair++;
                    }
                }
            }
        }

        long pariRev = 0;
        borrowed = false;
        for(int i=N-1;i>=0;i--){
            int num = AN[i];
            if (borrowed){
                num--;
                borrowed = false;
            }
            if(num>0){
                pariRev += Math.ceil(num/2);
            }
            if(num%2==1){
                if(i>0){
                    if(AN[i-1]>0){
                        borrowed = true;
                        pariRev++;
                    }
                }
            }
        }

        long max = pair;
        if(pariRev >pair) max = pariRev;

        System.out.print(max);

    }
 }
