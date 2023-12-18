import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int D =sc.nextInt();
        int ans=0;
        if (A< B){
            ans +=A;
            if (C<D){
                ans+=C;
            }else{
                ans +=D;
            }
        }else {
            ans += B;
            if (C < D) {
                ans += C;
            } else {
                ans += D;

            }
        }
        System.out.println(ans);
    }
}