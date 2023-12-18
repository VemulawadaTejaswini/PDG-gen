import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * TITLE : Bingo
 * URL : https://atcoder.jp/contests/abc157/tasks/abc157_b
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[9];
        for (int i = 0; i < 9; i++) {
            A[i] = sc.nextInt();
        }
        BingoCard bingoCard = new BingoCard(A);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            bingoCard.setHitNumber(sc.nextInt());
        }
        System.out.println(bingoCard.isBingo());
        sc.close();
    }

    static class BingoCard {
        List<Target> target = new ArrayList<Target>();
        BingoCard (int[] numbers) {
            target.add((new Target(numbers[0])));
            target.add((new Target(numbers[1])));
            target.add((new Target(numbers[2])));
            target.add((new Target(numbers[3])));
            target.add((new Target(numbers[4])));
            target.add((new Target(numbers[5])));
            target.add((new Target(numbers[6])));
            target.add((new Target(numbers[7])));
            target.add((new Target(numbers[8])));
        }
        static class Target {
            int number;
            boolean isHit;
            Target (int number) {
                this.number = number;
            }
        }
        public void setHitNumber(int number) {
            target.stream().filter(n -> n.number == number).forEach(h -> h.isHit = true);
        }

        public String isBingo() {
            if ( (target.get(0).isHit && target.get(1).isHit && target.get(2).isHit) ||
                    (target.get(3).isHit && target.get(4).isHit && target.get(5).isHit) ||
                    (target.get(6).isHit && target.get(7).isHit && target.get(8).isHit) ||
                    (target.get(0).isHit && target.get(3).isHit && target.get(6).isHit) ||
                    (target.get(1).isHit && target.get(4).isHit && target.get(7).isHit) ||
                    (target.get(2).isHit && target.get(5).isHit && target.get(8).isHit) ||
                    (target.get(0).isHit && target.get(4).isHit && target.get(8).isHit) ||
                    (target.get(2).isHit && target.get(4).isHit && target.get(6).isHit) ) {
                return "Yes";
            }
            return "No";
        }
    }
}