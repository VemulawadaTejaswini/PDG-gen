import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long ans = 0;
        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);

        int point = N-2;
        int count =2;
        for(int i=0;i<N;i++){
            if(i == 0){

            } else if(i == 1){
                ans += A[N-1];
            } else {
                ans += A[point];
                count--;
            }

            if(count == 0){
                count = 2;
                point--;
            }
        }
        System.out.println(ans);


    }

}


