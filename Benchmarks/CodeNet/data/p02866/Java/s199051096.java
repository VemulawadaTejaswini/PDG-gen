import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = sc.nextInt();

        if (min != 0) {
            System.out.println(0);
            return;
        }

        int max = min;
        ArrayList<Integer> numList = new ArrayList<>();
        int inNum;
        for (int i = 0; i < num - 1; i++) {
            inNum = sc.nextInt();
            numList.add(inNum);
            max = Math.max(inNum, max);
        }

        for (int i = min + 1; i < max; i++) {
            if (!numList.contains(i)) {
                System.out.println(0);
                return;
            }
        }

        int ans = 1;
        for (int i = 2; i <= max + 1; i++) {
            ans = ans * i;
        }
        System.out.println(ans);
    }
}