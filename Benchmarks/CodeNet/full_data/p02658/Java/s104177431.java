import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 1;
        boolean isOver = false;

        for(int i=0;i<N;i++){
            ans *= sc.nextLong();
            if(ans >= 1000000000000000001L || ans < 0l){
                isOver = true;

            }
        }

        if(isOver && ans != 0){
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }


    }

}
