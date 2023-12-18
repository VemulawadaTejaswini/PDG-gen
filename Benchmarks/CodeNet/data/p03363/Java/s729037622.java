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
                int count,ans = 0;
                int R;
                for(int i = 1; i < N;){
                        R = i;
                        while(A[i] != A[R])R ++;
                        count = 0;
                        while(A[i] == A[R]){
                                R++;
                                count ++;
                        }
                        ans += factorial(count);
                        count = 0;
                        i = R;
                }
                System.out.print(ans);
        }

        public static int factorial(int i){
                int ans = 1;
                for(int k = i; k > 2; k --)ans *= k;
                return ans;
        }
}
