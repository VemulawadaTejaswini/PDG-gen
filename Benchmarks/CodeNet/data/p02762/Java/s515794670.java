import java.util.*;
import java.util.function.ObjDoubleConsumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        int[] C = new int[K];
        int[] D = new int[K];
        HashSet<Integer>[] lists = new HashSet[N];
        HashSet<Integer>[] friends = new HashSet[N];
        for (int i = 0; i < N; i++) {
            friends[i] = new HashSet<>();
        }
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            if (Objects.isNull(lists[A[i] - 1]) && Objects.isNull(lists[B[i] - 1])) {
                lists[A[i] - 1] = new HashSet<Integer>();
                lists[A[i] - 1].add(B[i]);
                lists[A[i] - 1].add(A[i]);
                lists[B[i] - 1] = lists[A[i] - 1];
            } else if (Objects.isNull(lists[A[i] - 1]) && !Objects.isNull(lists[B[i] - 1])) {
                lists[B[i] - 1].add(B[i]);
                lists[B[i] - 1].add(A[i]);
                lists[A[i] - 1] = lists[B[i] - 1];
            } else if (!Objects.isNull(lists[A[i] - 1]) && Objects.isNull(lists[B[i] - 1])) {
                lists[A[i] - 1].add(B[i]);
                lists[A[i] - 1].add(A[i]);
                lists[B[i] - 1] = lists[A[i] - 1];
            } else {
                lists[A[i] - 1].add(A[i]);
                lists[A[i] - 1].add(B[i]);
                lists[B[i] - 1].addAll(lists[A[i] - 1]);
                lists[A[i] - 1].addAll(lists[B[i] - 1]);
            }
            friends[A[i] - 1].add(B[i]);
            friends[B[i] - 1].add(A[i]);
        }
        HashSet<Integer>[] blocks = new HashSet[N];
        for (int i = 0; i < N; i++) {
            blocks[i] = new HashSet<>();
        }
        for (int i = 0; i < K; i++) {
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
            blocks[C[i] - 1].add(D[i]);
            blocks[D[i] - 1].add(C[i]);
        }
//        Stream.of(lists).filter(l -> !Objects.isNull(l)).forEach(l -> {
//            System.out.print("[");
//            l.forEach(System.out::print);
//            System.out.println("]");
//        });
        for (int i = 0; i < N; i++) {
            if (Objects.isNull(lists[i])) {
                lists[i] = new HashSet<Integer>();
            }
        }
        for (int i = 0; i < N; i++) {
//            System.out.print("all [");
//            lists[i].forEach(System.out::print);
//            System.out.println("]");
//            System.out.print("block [");
//            blocks[i].forEach(System.out::print);
//            System.out.println("]");
//            System.out.print("friend [");
//            friends[i].forEach(System.out::print);
//            System.out.println("]");
            Set<Integer> l = new HashSet<>(lists[i]);
            l.removeAll(blocks[i]);
            l.removeAll(friends[i]);
            l.remove(i + 1);
            System.out.print(l.size());
            System.out.print(" ");
        }
    }
}
