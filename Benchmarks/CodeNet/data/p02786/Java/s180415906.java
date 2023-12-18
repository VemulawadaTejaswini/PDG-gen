import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static long count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        sc.close();

        List<Long> enemyList = new ArrayList<>();
        enemyList.add(H);
        atackEnemy(enemyList);

        System.out.println(count);
    }

    public static void atackEnemy(List<Long> enemyList) {
        for (Long hp : enemyList) {
            // atack !
            count++;
            if (hp == 1) {
                continue;
            } else if (hp > 1) {
                long newHP = hp / 2;
                if (newHP == 1) {
                    count += 2;
                    continue;
                }
                List<Long> newEnemies = new ArrayList<>();
                newEnemies.add(newHP);
                newEnemies.add(newHP);
                atackEnemy(newEnemies);
            }
        }

    }

}