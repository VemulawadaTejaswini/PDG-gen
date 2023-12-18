import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int remain = n - k;
        if (remain < 0) {
            System.out.println(0);
            return;
        }

        List<Long> hpList = new ArrayList<>();
        for (String hp : sc.nextLine().split(" ")) {
            hpList.add(Long.parseLong(hp));
        }

        Collections.sort(hpList);
        Collections.reverse(hpList);
        List<Long> remainedEnemies = hpList.subList(hpList.size() - remain, hpList.size());

        long sum = 0;
        for (Long remainedEnemy : remainedEnemies) {
            sum += remainedEnemy.intValue();
        }

        System.out.println(sum);
    }
}