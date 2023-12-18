import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long res = N / (A + B) * A;
        long m = N % (A + B);
        if(m>=A) res+=A;
        else res+=m;
        System.out.println(res);
    }
}