import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();

            HashSet<State> used = new HashSet<>();
            used.add(new State(A, B, C));

            int count = 0;
            for (;; count++) {
                if (A % 2 == 1 || B % 2 == 1 || C % 2 == 1) {
                    System.out.println(count);
                    break;
                }

                int nextA = B / 2 + C / 2;
                int nextB = A / 2 + C / 2;
                int nextC = A / 2 + B / 2;

                A = nextA;
                B = nextB;
                C = nextC;

                boolean add = used.add(new State(A, B, C));

                if (add == false) {
                    System.out.println(-1);
                    break;
                }
            }

        }
    }
}

class State {
    int a;
    int b;
    int c;

    public State(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        result = prime * result + c;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        State other = (State) obj;
        if (a != other.a)
            return false;
        if (b != other.b)
            return false;
        if (c != other.c)
            return false;
        return true;
    }

}