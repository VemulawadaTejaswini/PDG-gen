import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        boolean isEven = true;
        count = 10000;
        newCount = 0;

        while(isEven) {
            isEven = true;
            newCount = 0;
            for (int i = 1; i <= max; i++) {
                if (i % 2 == 0) {
                    i = i / 2;
                } else {
                    isEven = false;
                }
            }
            if(count > newCount) {
                count = newCount;
            }
        }
        System.out.println(count);
    }
}