import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long Q = scan.nextLong();
        long H = scan.nextLong();
        long S = scan.nextLong();
        long D = scan.nextLong();
        long N = scan.nextLong();

        H = Math.min(H, 2*Q);
        S = Math.min(S, 2*H);
        D = Math.min(D, 2*S);

        System.out.println((N/2)*D + (N%2)*S);
    }
}