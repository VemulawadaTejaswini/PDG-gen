import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyword = sc.next();
        PriorityQueue<Integer> pque = new PriorityQueue<Integer>(11, Collections.reverseOrder());
        while (!keyword.equals("end")) {
            //System.out.println(pque);
            switch (keyword) {
            case "insert":
                int n = sc.nextInt();
                pque.add(n);
                break;
            case "extract":
                System.out.println(pque.poll());
                break;
            default:
                break;
            }

            keyword = sc.next();
        }
    }
}

