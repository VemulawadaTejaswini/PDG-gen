import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long C = 100;
        int ans =0;
        while(C<X){
            C = cal(C);
            ans++;
        }
        System.out.println(ans);

    }
    private static long cal(long x){

        long amp = x + (x/100);
        return amp;
    }
}
