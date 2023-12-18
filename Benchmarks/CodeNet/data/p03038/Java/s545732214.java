import java.util.*;

public class Main {

    private static int N, M;
    private static PriorityQueue<Integer> A;
    private static LinkedList<LinkedList<Integer>> BtoC;

    private static void read() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new PriorityQueue<>();
        for (int i = 0; i < N; i += 1) {
            A.add(Integer.parseInt(sc.next()));
        }
        BtoC = new LinkedList<>();
        for (int i = 0; i < M; i += 1) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(Integer.parseInt(sc.next()));
            list.add(Integer.parseInt(sc.next()));
            BtoC.add(list);
        }
    }

    public static void main(String[] args) {
        read();

        Collections.sort(BtoC, new Comparator<LinkedList<Integer>>() {
            @Override
            public int compare(LinkedList<Integer> o1, LinkedList<Integer> o2) {
                Integer C1 = o1.getLast();
                Integer C2 = o2.getLast();

                return C1.compareTo(C2);
            }
        });

        for (int i = 0; i < M; i += 1) {
            LinkedList<Integer> list = BtoC.removeFirst();
            int Bi = list.getFirst();
            int Ci = list.getLast();
            for (int j = 0; j < Bi; j += 1) {
                if (Ci > A.peek()) {
                    A.poll();
                    A.add(Ci);
                } else {
                    break;
                }
            }
        }

        long ret = 0;
        for (int Ai : A) {
            ret += Ai;
        }
        System.out.println(ret);
    }
}
