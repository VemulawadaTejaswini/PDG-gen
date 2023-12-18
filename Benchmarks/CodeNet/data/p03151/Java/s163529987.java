import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.IntStream;

class Exam{
    private final int index;
    private final int actual;
    private int expected;
    private int difference;

    Exam(int index,int actual){
        this.index = index;
        this.actual = actual;
    }

    public void setExpected(int expected) {
        this.expected = expected;
        this.difference = actual - expected;
    }

    public int getExpected() {
        return expected;
    }

    public int getDifference() {
        return difference;
    }

    public int getIndex() {
        return index;
    }
}

class Solver {

    private final int[] A;
    private final int[] B;
    private final int N;
    private final Exam[] E;

    Solver(Scanner in){
        N = in.nextInt();
        A = new int[N];
        E = new Exam[N];
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            E[i] = new Exam(i, a);
            A[i] = a;
        }
        B = new int[N];
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            E[i].setExpected(a);
            B[i] = a;
        }
    }

    void solve() {
        Arrays.sort(E, Comparator.comparingInt(Exam::getDifference));
        Deque<Exam> exams = new ArrayDeque<>(Arrays.asList(E));

        Exam lower = exams.removeFirst();
        long diff = lower.getDifference();
        if (diff >= 0) {
            System.out.println(0);
            return;
        }
        int counter = 1;
        while (!exams.isEmpty() && diff < 0) {
            Exam higher = exams.removeLast();
            int plus = higher.getDifference();
            if (plus <= 0) break;
            diff += plus;
            counter++;
            while (!exams.isEmpty() && diff > 0) {
                lower = exams.removeFirst();
                int minus = lower.getDifference();
                if (minus >= 0) break;
                diff += minus;
                counter++;
            }
        }
        if (diff < 0) System.out.println(-1);
        else System.out.println(counter);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}