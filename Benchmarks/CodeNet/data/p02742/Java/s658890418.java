
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();

        Set<Cell> set = new HashSet<>();
        set.add(new Cell(1, 1));

        long beforeSize = 0;
        Set<Cell> nextSet = set;
        while (beforeSize != set.size()) {
            beforeSize = set.size();

            Set<Cell> newSet = nextSet.stream().flatMap(e -> {
                Set<Cell> targets = new HashSet<>();
                targets.add(new Cell(e.x + 1, e.y + 1));
                targets.add(new Cell(e.x + 1, e.y - 1));
                targets.add(new Cell(e.x - 1, e.y + 1));
                targets.add(new Cell(e.x - 1, e.y - 1));

                return targets.stream().filter(target -> target.x <= W && target.y <= H && target.x > 0 && target.y > 0).filter(target -> {
                    long r1plusc1 = e.x + e.y;
                    long r1minusc1 = e.x - e.y;
                    long r2plusc2 = target.x + target.y;
                    long r2minusc2 = target.x - target.y;
                    return r1plusc1 == r2plusc2 || r1minusc1 == r2minusc2;
                });
            }).collect(Collectors.toSet());
            set.addAll(newSet);
            nextSet = newSet;
        }
    }
}

class Cell {
    long x;
    long y;

    public Cell(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
