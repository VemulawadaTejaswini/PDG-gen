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

        Integer[][] arr = new Integer[K][4];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = j;
            }
        }
        // 全探索用の配列を生成
        combination(0, arr, "");

        int maxVal = 0;
        for (int i = 0; i < combine.size(); i++) {
            Deque<Integer> deque = new ArrayDeque<Integer>(dequeInit);
            List<Integer> jewery = new ArrayList<Integer>();
            sumVal = 0;
            for (int j = 0; j < K; j++) {
                String[] split = combine.get(i).split(",");
                String opeNum = split[j];
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
            if (sumVal > maxVal) {
                maxVal = sumVal;
            }
        }

        System.out.println(maxVal);

    }

    private static void combination(int i, Integer[][] arr, String output) {
        if (i == arr.length) {
            combine.add(output);
            return;
        }
        String delim = (output.length() > 0) ? "," : "";
        for (int j = 0; j < arr[i].length; j++) {
            combination(i + 1, arr, output + delim + arr[i][j]);
        }
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
