import java.util.*;

class Pair<E1 extends Comparable<E1>, E2 extends Comparable<E2>>
        implements Comparable<Pair<E1, E2>> {
    private E1 first;
    private E2 second;

    public Pair(E1 first, E2 second) {
        this.first = first;
        this.second = second;
    }

    public E1 getFirst() {
        return first;
    }

    public E2 getSecond() {
        return second;
    }

    public void setFirst(E1 first) {
        this.first = first;
    }

    public void setSecond(E2 second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[first=" + first + ",second=" + second + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        Pair<?, ?> p = (Pair<?, ?>) other;
        return Objects.equals(first, p.first) && Objects.equals(second, p.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public int compareTo(Pair<E1, E2> other) {
        return Comparator.comparing(Pair<E1, E2>::getFirst).thenComparing(Pair<E1, E2>::getSecond)
                .compare(this, other);
    }
}


public class Main {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        final String cs = in.next();

        // try all possible ways of coloring the right half
        // if the reverse of the red string on the right hand side is cRRs
        // and the reverse of the blue string on the left hand side is cRBs
        // count the number of times the pair (cRRs, cRBs) occurs
        String cRs = cs.substring(N, 2 * N);
        Map<Pair<String, String>, Long> rbStringToNumber = new HashMap<>();
        for (int S = 0; S < 1 << N; S++) {
            StringBuilder builder0 = new StringBuilder(), builder1 = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if ((S & (1 << i)) == 0) {
                    builder0.append(cRs.charAt(i));
                } else {
                    builder1.append(cRs.charAt(i));
                }
            }
            Pair<String, String> rbString =
                    new Pair(builder0.reverse().toString(), builder1.reverse().toString());
            rbStringToNumber.computeIfAbsent(rbString, string -> 0L);
            rbStringToNumber.computeIfPresent(rbString, (string, num) -> num + 1);
        }
        // System.out.printf("rbStringToNumber:\n%s\n", rbStringToNumber);

        // try all possible ways of coloring the right half
        String cLs = cs.substring(0, N);
        long ans = 0;
        for (int S = 0; S < 1 << N; S++) {
            StringBuilder builder0 = new StringBuilder(), builder1 = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if ((S & (1 << i)) == 0) {
                    builder0.append(cLs.charAt(i));
                } else {
                    builder1.append(cLs.charAt(i));
                }
            }
            Pair<String, String> rbString =
                    new Pair(builder0.toString(), builder1.toString());
            ans += rbStringToNumber.getOrDefault(rbString, 0L);
        }
        System.out.printf("%d\n", ans);
    }
}
