import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        long ans = 0;
        for(int i=0;i<=N;i++){
            long temp = floor(A,B,N-i);
            if(temp>=ans){
                ans = temp;
            }
        }
        System.out.println(ans);

    }
    private static long floor(long A,long B,long x){
        long a = (long) (Math.floor(A*x/B)-A*Math.floor(x/B));
        return a;

    }

}
