import java.util.*;

public class Main {
    public static Deque<Integer> hashList = new ArrayDeque<>();

    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        for (int k = 0; k < total; k++) {
            String command = inp.next();

            switch (command) {
                case "insert": {
                    int num = inp.nextInt();

                    hashList.addFirst(num);
                    break;
                }
                case "delete": {
                    int num = inp.nextInt();

                    hashList.remove(num);
                    break;
                }
                case "deleteFirst":

                    hashList.removeFirst();
                    break;
                case "deleteLast":

                    hashList.removeLast();
                    break;
            }
        }

        //int counter = 0;

        StringBuilder pInt = new StringBuilder();

        pInt.append(hashList.poll());
        for(int n : hashList)
            pInt.append(" ").append(n);

        System.out.println(pInt);
    }
}
