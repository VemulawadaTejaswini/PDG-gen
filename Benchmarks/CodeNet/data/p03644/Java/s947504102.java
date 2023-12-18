import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        boolean isEven = true;
        int count = 0;
        int newCount = 0;
        int favoriteNumber = 0;
        sc.close();

        for (int i = 1; i <= max; i++) {
            int number = i;
            isEven = true;
            newCount = 0;
            while(isEven) {
                if (number % 2 == 0) {
                    number = number / 2;
                    newCount++;
                } else {
                    isEven = false;
                    break;
                }
            }
            if (count < newCount) {
                count = newCount;
                favoriteNumber = i;
            }
        }
        System.out.println(favoriteNumber);
    }
}