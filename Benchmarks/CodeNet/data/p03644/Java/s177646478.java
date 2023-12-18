import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        boolean isEven = true;
        int count = 0;
        int newCount = 0;

        for (int i = 1; i < max; i++) {
            isEven = true;
            newCount = 0;
            while(isEven) {
                if (i % 2 == 0) {
                    i = i / 2;
                    newCount++;
                } else {
                    isEven = false;
                    break;
                }
            }
        }
        if (count < newCount) {
            count = newCount;
        }
        System.out.println(count);
    }
}