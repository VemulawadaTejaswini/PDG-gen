import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        if(N<B) System.out.println((A*N)/B-A*(N/B));
        else System.out.println((A*(B-1))/B-A*((B-1)/B));
    }
}