import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] A;
        PriorityQueue<Double> queue1 = new PriorityQueue<>(1,new TaskComparator1());


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new long[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextLong();
            }
        }

        for (int i = 0; i < A.length; i++) {
            queue1.offer((double)A[i]);
        }

        while(queue1.size() >= 2){
            double a = queue1.poll();
            double b = queue1.poll();
            double c = (double)(a + b) /(double)2;
            queue1.add(c);
        }

        System.out.println(queue1.poll());

    }

    static class TaskComparator1  implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Double x = (Double)o1;
            Double y = (Double)o2;
            if (x > y) {
                return 1;
            } else if (x < y) {
                return -1;
            } else{
                return 0;
            }
        }
    }

}
