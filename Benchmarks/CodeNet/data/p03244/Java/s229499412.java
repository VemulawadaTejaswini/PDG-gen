import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<E> odd = new ArrayList<>(100_001);
        List<E> even = new ArrayList<>(100_001);
        for (int i = 0; i < 100_001; i++) {
            E oddE = new E(i);
            odd.add(oddE);
            E evenE = new E(i);
            even.add(evenE);
        }

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                E oddE = odd.get(sc.nextInt());
                oddE.count++;
            } else {
                E evenE = even.get(sc.nextInt());
                evenE.count++;
            }
        }

        Collections.sort(odd);
        Collections.sort(even);

        E firstOdd = odd.get(0);
        E firstEven = even.get(0);

        if (firstEven.num == firstOdd.num) {
            if (firstEven.count + odd.get(1).count >= firstOdd.count + even.get(1).count) {
                firstOdd = odd.get(1);
            } else {
                firstEven = even.get(1);
            }
        }

        System.out.println(N - (firstEven.count + firstOdd.count));
    }

    static class E implements Comparable<E> {

        int num;
        int count;

        public E(int num) {
            this.num = num;
        }

        @Override
        public int compareTo(E o) {
            return o.count - this.count;
        }

    }
}