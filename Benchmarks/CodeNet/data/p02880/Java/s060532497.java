import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean divisible = false;

        for(int i = 9; i >=1; i--) {
            double divided = N/i;
            if((Math.round(divided) == divided) && divided >= 1 && divided <= 9) {
                divisible = true;
            }
        }

        if(divisible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
}

    }
}