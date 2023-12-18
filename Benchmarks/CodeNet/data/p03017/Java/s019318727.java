import java.util.*;

public class Main {

    public int n;
    public int sunukeStart;
    public int funukeStart;
    public int sunukeGoal;
    public int funukeGoal;

    String[] points;

    public static void main(String[] args) {
        (new Main()).go();
    }

    public void go() {
        Scanner sc = new Scanner(System.in);

        this.n = Integer.parseInt(sc.next());
        this.sunukeStart = Integer.parseInt(sc.next()) - 1;
        this.funukeStart = Integer.parseInt(sc.next()) - 1;
        this.sunukeGoal = Integer.parseInt(sc.next()) - 1;
        this.funukeGoal = Integer.parseInt(sc.next()) - 1;

        this.points = sc.next().split("");

        if (this.run(this.sunukeStart, this.funukeStart)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public boolean run(int sCurrent, int fCurrent) {
        if (sCurrent == this.sunukeGoal && fCurrent == this.funukeGoal) {
            return true;
        }
        if (this.n <= sCurrent || this.n <= fCurrent || this.points[sCurrent].equals("#")
                || this.points[fCurrent].equals("#") || sCurrent == fCurrent || this.sunukeGoal < sCurrent
                || this.funukeGoal < fCurrent) {
            return false;
        }

        for (int i = 1; i <= 2; i++) {
            if (this.run(sCurrent + i, fCurrent)) {
                return true;
            }
            if (this.run(sCurrent, fCurrent + i)) {
                return true;
            }
        }
        return false;
    }
}