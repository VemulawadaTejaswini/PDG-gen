import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long maxIndex = 0;
        long maxValue = 0;
        int n = sc.nextInt();
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split(" ");
            long a = Long.valueOf(split[0]);
            long b = Long.valueOf(split[1]);
            if (maxIndex < a) {
                maxIndex = a;
                maxValue = b;
            }
        }
        System.out.println(maxIndex + maxValue);
    }
}