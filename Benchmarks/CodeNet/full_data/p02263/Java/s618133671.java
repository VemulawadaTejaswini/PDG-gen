import java.util.*;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try{

            while (sc.hasNext()) {

                String str = sc.nextLine();
                Deque<Integer> deq = new ArrayDeque<Integer>();

                String[] s_array = str.split(" ");

                if (s_array.length > 2) {

                    for (int i = 0; i < s_array.length; i++) {

                        if (s_array[i].toString().equals("*")) {

                            deq.addFirst((deq.removeFirst() * deq.removeFirst()));

                        } else if (s_array[i].toString().equals("/")) {

                            int x = deq.removeFirst(), y = deq.removeFirst();
                            deq.addFirst(y/x);

                        } else if (s_array[i].toString().equals("+")) {

                            deq.addFirst((deq.removeFirst() + deq.removeFirst()));

                        } else if (s_array[i].toString().equals("-")) {

                            int x = deq.removeFirst(), y = deq.removeFirst();
                            deq.addFirst(y-x);

                        } else {

                            deq.addFirst(Integer.valueOf(s_array[i].toString()));

                        }
                    }

                    System.out.printf("%d\r\n", deq.removeFirst());

                }

            }

        } finally {

            sc.close();

        }

    }
}
