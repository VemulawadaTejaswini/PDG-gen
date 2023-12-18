import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = input.nextInt() * input.nextInt();
        int taxi = input.nextInt();

        if (sum <= taxi) {
            System.out.println(sum);
        } else
            System.out.println(taxi);

        input.close();
    }
}