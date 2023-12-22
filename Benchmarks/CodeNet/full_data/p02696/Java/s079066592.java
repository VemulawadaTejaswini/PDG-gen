import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long N = sc.nextInt();

        long ans = 0;
        if(N >= B-1){
            ans = A*(B-1)/B;
        }else{
            ans = A*N/B;
        }

        System.out.println(ans);
    }
}
