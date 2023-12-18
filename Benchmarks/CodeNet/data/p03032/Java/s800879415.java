import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<String> combine = new ArrayList<String>();
    private static int sumVal;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 宝石の価値
        Deque<Integer> dequeInit = new ArrayDeque<Integer>();
        for (int i = 0; i < N; i++) {
            dequeInit.addLast(sc.nextInt());
        }
        sc.close();

        int maxVal = 0;
        for (int l = 0; l < Math.pow(4, K); l++) {
            String base4 = Integer.toString(l, 4);
            base4 = String.format("%0" + K + "d", Integer.valueOf(base4));
            Deque<Integer> deque = new ArrayDeque<Integer>(dequeInit);
            List<Integer> jewery = new ArrayList<Integer>();
            sumVal = 0;
            for (int j = 0; j < K; j++) {
                String opeNum = base4.substring(j, j + 1);
                switch (opeNum) {
                case "0":
                    if (deque.size() == 0)
                        break;
                    operationA(deque, jewery);
                    break;
                case "1":
                    if (deque.size() == 0)
                        break;
                    operationB(deque, jewery);
                    break;
                case "2":
                    if (jewery.size() == 0)
                        break;
                    operationC(deque, jewery);
                    break;
                case "3":
                    if (jewery.size() == 0)
                        break;
                    operationD(deque, jewery);
                    break;
                }
                if (sumVal > maxVal) {
                    maxVal = sumVal;
                }
            }
        }

        System.out.println(maxVal);

    }

    // [操作A] 左端から値を取り出す
    private static void operationA(Deque<Integer> dequeue, List<Integer> jewery) {
        int target = dequeue.getFirst();
        sumVal += target;
        jewery.add(target);
        dequeue.removeFirst();
    }

    // [操作B] 右端から値を取り出す
    private static void operationB(Deque<Integer> dequeue, List<Integer> jewery) {
        int target = dequeue.getLast();
        sumVal += target;
        jewery.add(target);
        dequeue.removeLast();
    }

    // [操作C] 左端に値を戻す
    private static void operationC(Deque<Integer> dequeue, List<Integer> jewery) {
        int dropVal = Collections.min(jewery);
        int dropInd = dropJewery(jewery, dropVal);
        sumVal -= dropVal;
        jewery.remove(dropInd);
        dequeue.addFirst(dropVal);
    }

    // [操作D] 右端に値を戻す
    private static void operationD(Deque<Integer> dequeue, List<Integer> jewery) {
        int dropVal = Collections.min(jewery);
        int dropInd = dropJewery(jewery, dropVal);
        sumVal -= dropVal;
        jewery.remove(dropInd);
        dequeue.addLast(dropVal);
    }

    // 捨てる宝石のインデックス番号を取得する
    private static int dropJewery(List<Integer> jewery, int value) {
        return jewery.indexOf(value);
    }
}