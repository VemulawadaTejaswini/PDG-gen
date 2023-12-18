import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isAllEven = true;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int count = 0;
        while (isAllEven) {
            for (Integer number : numbers) {
                if (number % 2 != 0) {
                    isAllEven = false;
                    break;
                } else {
                    number = number / 2;
                }
            }
            if (isAllEven) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);

    }
}