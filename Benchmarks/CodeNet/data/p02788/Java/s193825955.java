
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long cover = sc.nextLong();
        long attack = sc.nextLong();
        Enemy[] enemies = new Enemy[N];
        for (int i = 0; i < enemies.length; i++) {
            Enemy e = new Enemy();
            e.pos = sc.nextLong();
            e.hp = sc.nextLong();
            enemies[i] = e;
        }
        Arrays.sort(enemies, Comparator.comparingLong(e -> e.pos));
        long count = 0;

        for (int i = 0, j = 1; i < enemies.length; i++) {
            if (enemies[i].hp <= 0) {
                continue;
            }
            for (; j < enemies.length; j++) {
                if (j == i) {
                    continue;
                }
                if (enemies[j].pos > enemies[i].pos + cover * 2) {
                    break;
                }
            }
            long aCount = (long) Math.ceil(((float) enemies[i].hp) / attack);
            for (int k = 0; k < j; k++) {
                enemies[k].hp -= aCount * attack;
            }
            count += aCount;
        }
        System.out.println(count);
    }

    static class Enemy {
        long pos;
        long hp;

        public String toString() {
            return pos + ":" + hp;
        }
    }
}