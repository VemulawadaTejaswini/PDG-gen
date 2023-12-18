import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list[i] = value;
        }

        int count = 0;
        loop : while (true) {
            boolean isStart = false;
            for (int i = 0; i < n; i++) {
                if (list[i] == 0) {
                    if (isStart) {
                        break;
                    } else if (i == n - 1){
                        break loop;
                    }
                }
                else {
                    if (!isStart) {
                        isStart = true;
                        count++;
                    }
                    list[i]--;
                }
            }
        }

        System.out.println(count);
    }
}