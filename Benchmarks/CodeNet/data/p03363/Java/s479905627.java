import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                long [] A = new long[N];
                for(int i = 0; i < N; i ++){
                        if(i == 0){
                                A[0] = sc.nextInt();
                                continue;
                        }else{
                                A[i] = A[i-1] + sc.nextInt();
                        }
                }
                Arrays.sort(A);

                //for(long a : A)System.out.println(a); //check

                int count = 1,ans = 0;
                int R;
                for(int i = 0; i < N - 1; i ++){
                        /*
                        R = i + 1;
                        while(A[i] != A[R]){
                                R ++;
                                if(R >= N)break;
                        }
                        count = 0;
                        while(A[i] == A[R]){
                                R++;
                                count ++;
                                if(R >= N)break;
                        }*/
                        if(A[i]==0){
                                ans ++;
                        }
                        if(A[i] == A[i+1]){
                                count ++;
                                if(i == N-2){
                                         if(count>1)ans += factorial(count);
                                }
                        }else if(A[i] != A[i+1] || i == N-2){
                                if(count>1)ans += factorial(count);
                                count = 1;
                        }
                }
                System.out.print(ans);
        }

        public static int factorial(int i){
                int ans = 1;
                for(int k = i - 1; k >= 1; k --)ans *= k;
                return ans;
        }
}
