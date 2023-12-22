import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int sum = 0;
        int count = 0;
        while(sum != 360) {
            sum += X;
            count++;
            if(sum >= 360) sum -= 360;
            System.out.println(sum);
        }
        System.out.println(count);
    }
}