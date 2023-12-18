
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

class Monster implements Comparable<Monster> {
    long x;
    long h;
    Monster(long x, long h) {
        this.x = x;
        this.h = h;
    }
    void setH(long h) {
        this.h = h;
    }
    @Override
    public int compareTo(Monster o) {
        return Long.compare(this.x, o.x);
    }
}
class Bomb implements Comparable<Bomb>{
    public long end;
    public long times;
    Bomb(long end, long times) {
        this.end = end;
        this.times = times;
    }
    void setTimes(long times) {
        this.times = times;
    }

    @Override
    public int compareTo(Bomb o) {
        return Long.compare(this.end, o.end);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bomb bomb = (Bomb) o;
        return end == bomb.end &&
                times == bomb.times;
    }

    @Override
    public int hashCode() {
        return Objects.hash(end, times);
    }
}
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long d = scanner.nextLong();
        long a = scanner.nextLong();
        Monster[] monsters = new Monster[n];
        for (int i = 0; i < n; ++i) {
            long x = scanner.nextLong();
            long h = scanner.nextLong();
            monsters[i] = new Monster(x, h);
        }
        Arrays.sort(monsters);
        long ans = 0;
        List<Bomb> bombs = new ArrayList<>();
        List<Long> decreasedHealths = new ArrayList<>();
        long totalDecreasedHealths = 0;
        for (int i = 0; i < n; ++i) {
            long x = monsters[i].x;
            long h = monsters[i].h;
            if (h <= 0) {
                continue;
            }
            int index = Collections.binarySearch(
                    bombs,
                    new Bomb(x - 1, Long.MAX_VALUE)
            );
            int firstCoveredIndex = -(index + 1);
            long decreasedHealth = firstCoveredIndex - 1 < decreasedHealths.size() && firstCoveredIndex - 1 >= 0 ?
                    totalDecreasedHealths - decreasedHealths.get(firstCoveredIndex - 1)
                    : totalDecreasedHealths;
            long remainH = h - decreasedHealth;
            if (remainH <= 0) {
                continue;
            }
            long bombTimes = remainH / a;
            if (remainH % a != 0) {
                bombTimes++;
            }
            ans += bombTimes;
            Bomb bomb = new Bomb(x + 2 * d, bombTimes);
//            System.out.println("current x: " + x  + " remainHealth: " + remainH +
//                     " bomb: (" + bomb.end + " " + bomb.times + ")");
            bombs.add(bomb);
            totalDecreasedHealths += bombTimes * a;
            decreasedHealths.add(totalDecreasedHealths);
        }
        System.out.print(ans);
    }
}
