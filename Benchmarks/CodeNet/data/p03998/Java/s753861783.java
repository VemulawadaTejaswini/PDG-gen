import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Map<State, Queue<String>> Qmap = new HashMap<>();
    static {
        Qmap.put(State.A, new ArrayDeque<>());
        Qmap.put(State.B, new ArrayDeque<>());
        Qmap.put(State.C, new ArrayDeque<>());
    }
    static State CURRENT_STATE = State.A;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sa = scan.next();
        String sb = scan.next();
        String sc = scan.next();

        addToQueue(State.A, sa);
        addToQueue(State.B, sb);
        addToQueue(State.C, sc);

        while (true) {
            String elm = poll();
            // System.err.printf("state:%s poll:%s\n", CURRENT_STATE, elm);
            changeQueueState(elm);

            if (isEnd()) {
                System.out.println(CURRENT_STATE);
                break;
            }
        }
    }

    /**
     * 操作するキューオブジェクトを引数のオブジェクト名の対象に変更する
     */
    private static void changeQueueState(String elm) {
        CURRENT_STATE = State.getEnum(elm);
    }

    /**
     * 現在の参照キューが空かどうかを判定する
     */
    private static boolean isEnd() {
        return Qmap.get(CURRENT_STATE).isEmpty();
    }

    /**
     * 現在の参照キューから値をpollする
     */
    private static String poll() {
        return Qmap.get(CURRENT_STATE).poll();
    }

    /**
     * 入力文字を属性に応じたキューに追加する。
     */
    private static void addToQueue(State state, String s) {
        Queue<String> queue = Qmap.get(state);
        for (int i = 0; i < s.length(); i++) {
            queue.add(String.valueOf(s.charAt(i)));
        }
    }

    /**
     * どのキューを参照しているかを示す為の文字列属性
     */
    enum State {
        A, B, C;
        public static State getEnum(String s) {
            for (State state : State.values()) {
                if (state.name().toLowerCase().equals(s)) {
                    return state;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
