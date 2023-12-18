import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class DiscountedItem {
    final long original;
    int count;

    DiscountedItem(long value){
        this.original = value;
    }

    long actualPayment(){
        return (long) Math.ceil(original / Math.pow(2, count));
    }
}

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        PriorityQueue<DiscountedItem> A = new PriorityQueue<>(Comparator.comparing(DiscountedItem::actualPayment).reversed());
        for (int i = 0; i < N; i++) {
            A.add(new DiscountedItem(sc.nextLong()));
        }
        for (int i = 0; i < M; i++) {
            DiscountedItem peek = A.remove();
            peek.count++;
            A.add(peek);
        }
        System.out.println(A.stream().mapToLong(DiscountedItem::actualPayment).sum());
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}