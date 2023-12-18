import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((int)Math.pow(N,3));
    }
}

// cool function

//     public static boolean isPrime(int n) {
//        return !new String(new char[n]).matches(".?|(..+?)\\1+");
//    }
