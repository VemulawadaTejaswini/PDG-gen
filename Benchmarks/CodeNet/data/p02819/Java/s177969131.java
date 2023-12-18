import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 2) {
            System.out.printf("%d%n",a);
            return;
        }
        if (a % 2 == 0) a += 1;
        while (true) {
            if (isPrime(a)) {
                System.out.printf("%d%n",a);
                return;
            }
            a += 2;
        }
        
    }
    
    private static boolean isPrime(int a) {
        for (int b = 3; b * b <= a; b += 2) {
                if (a % b == 0) {
                    return false;
                }
            } 
        return true;
    }
}