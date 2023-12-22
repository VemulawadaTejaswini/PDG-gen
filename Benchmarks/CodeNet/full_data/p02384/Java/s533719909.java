import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int[] spots = new int[6];
    for (int i = 0; i < 6; i++) {
        spots[i] = sc.nextInt();
    }

    Dice dice = new Main().new Dice(spots);

    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
        int topN = sc.nextInt();
        int frontN = sc.nextInt();
        dice = dice.topOf(topN);
        dice = dice.frontOf(frontN);
        pw.println(dice.right());
    }

    pw.flush();
  }

  class Dice {

    private int[] spots = new int[6];

    public Dice(int[] spots) {
        this.spots = spots;
    }

    public Dice north() {
        return new Dice(new int[]{
            front(),
            bottom(),
            right(),
            left(),
            top(),
            back()
        });
    }

    public Dice west() {
        return new Dice(new int[]{
            right(),
            front(),
            bottom(),
            top(),
            back(),
            left()
        });
    }

    public Dice east() {
        return new Dice(new int[]{
            left(),
            front(),
            top(),
            bottom(),
            back(),
            right()
        });

    }

    public Dice south() {
        return new Dice(new int[]{
            back(),
            top(),
            right(),
            left(),
            bottom(),
            front()
        });
    }

    public Dice rotate() {
        return new Dice(new int[]{
            top(),
            left(),
            front(),
            back(),
            right(),
            bottom()
        });
    }

    public int top() {
        return spots[0];
    }

    public int bottom() {
        return spots[5];
    }

    public int front() {
        return spots[1];
    }

    public int back() {
        return spots[4];
    }

    public int left() {
        return spots[3];
    }

    public int right() {
        return spots[2];
    }

    public Dice topOf(int topN) {
        Dice[] dices = new Dice[]{
            this,
            this.south(),
            this.east(),
            this.west(),
            this.north(),
            this.south().south()
        };
        for (Dice dice : dices) {
            if (dice.top() == topN) {
                return dice;
            }
        }
        return null;
    }

    public Dice frontOf(int frontN) {
        Dice[] dices = new Dice[]{
            this.rotate(),
            this.rotate().rotate(),
            this.rotate().rotate().rotate(),
            this.rotate().rotate().rotate().rotate(),
        };
        for (Dice dice : dices) {
            if (dice.front() == frontN) {
                return dice;
            }
        }
        return null;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < spots.length; i++) {
            sb.append(i + ": " + spots[i] + ", ");
        }
        sb.append("]");
        return sb.toString();
    }
  }
}
