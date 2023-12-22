import java.util.*;

public class Contest {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        int[] test = new int[5];
        for (int i = 0; i<5 ;i++){
            test[i] = scanner.nextInt();
        }

        for (int i = 0; i<5 ;i++){
            if (test[i] == 0) {

                System.out.println(i + 1);

            }
        }
    }
}