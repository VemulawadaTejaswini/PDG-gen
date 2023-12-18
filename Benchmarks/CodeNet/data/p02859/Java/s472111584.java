import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int R = sc.nextInt();

            System.out.println(R * R);
        }
    }

}
