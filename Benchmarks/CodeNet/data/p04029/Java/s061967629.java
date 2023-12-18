import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), sum = 0;
        
        for (int i = 0; i <= N; i++) {
            sum += i;
        }

        System.out.println(sum);

        sc.close();
    }
}