import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.math.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long A[] = new long[N];
        long ans = 1;
        long max = (long)Math.pow(10, 18);
            for(int i=0;i<N;i++){
                A[i] = scanner.nextLong();
                if(A[i] == 0){
                    ans = 0;
                    break;
                }
                ans *= A[i];
                if(ans > max){
                    ans = -1;
                    break;
                }
            }

            System.out.println(ans);
    }

}