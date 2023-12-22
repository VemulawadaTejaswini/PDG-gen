import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                int targetThing = sc.nextInt();
                int weight = 512;

                Deque<Integer> result = new LinkedList<Integer>();

                while (targetThing > 0) {
                    if (targetThing < weight) {
                        weight /= 2;
                    } else {
                        targetThing -= weight;
                        result.push(weight);
                    }
                }
                print(result);
            }
        } finally {
            sc.close();
        }
    }

    public static void print(Deque<Integer> deque) {
        StringBuilder sb = new StringBuilder();
        for (int num : deque) {
            sb.append(num).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}