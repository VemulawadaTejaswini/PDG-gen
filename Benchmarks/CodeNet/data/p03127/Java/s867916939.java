import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        int result = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            for(int j=i-1;j>0;j--){
                int big =  A[j];
                int small = A[i];
                while(big % small != 0){
                    int temp = big;
                    big = small;
                    small = temp % small;
                }
                result = Math.min(result,small);
            }
        }
        System.out.println(result);

    }
}
