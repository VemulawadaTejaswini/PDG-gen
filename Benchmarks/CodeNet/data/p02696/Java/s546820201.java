import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
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
    private static long floor(int A,long B,long x){

        return (long) (Math.floor(A*x/B)-A*Math.floor(x/B));

    }

}
