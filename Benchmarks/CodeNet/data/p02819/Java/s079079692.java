import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int plus = X;
        while (true) {
            if (boolPrimeNumber(plus)){
                System.out.println(plus);
                break;
            }
            plus++;
        }
    }

    public static boolean boolPrimeNumber (int x){
        for (int i = 2; i < (int) Math.sqrt(x); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}