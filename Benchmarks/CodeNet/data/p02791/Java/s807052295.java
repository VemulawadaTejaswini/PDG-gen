import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        int temp = 0;

        for (int i = 0; i < a; i++) {
            numbers.add(sc.nextInt());
        }

        int low = numbers.get(0);
        for (int i = 0; i < a; i++) {
            if (numbers.get(i) < low) {
                low = numbers.get(i);
            }
            if (numbers.get(i) <= low) {
                temp++;
            }
        }
        System.out.println(temp);
    }
}