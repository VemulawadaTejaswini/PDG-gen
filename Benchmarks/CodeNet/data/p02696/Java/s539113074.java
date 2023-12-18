import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        long ans = 0;
        for(int i=0;i<=N;i++){
            long temp = floor(A,B,N-i);
            if(temp>=ans){
                ans = temp;
            }
        }
        System.out.println(ans);

    }
    private static long floor(int A,int B,int x){
        long a = (long) (Math.floor(A*x/B)-A*Math.floor(x/B));
        return a;

    }

}
