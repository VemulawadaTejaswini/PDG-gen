import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        int Q = scanner.nextInt();
        LinkedList<Character> q = new LinkedList<>();
        for(int i =0; i < S.length; i++) {
            q.addLast(S[i]);
        }

        for(int i = 0; i < Q; i++) {
            int T = scanner.nextInt();
            if(T == 1) {
                if(q.size() < 2) continue;
                char f = q.getFirst();
                char l = q.getLast();
                q.removeFirst();
                q.removeLast();
                q.addFirst(l);
                q.addLast(f);
            }else {
                int F = scanner.nextInt();
                String C = scanner.next();
                if(F == 1) {
                    q.addFirst(C.toCharArray()[0]);
                }else {
                    q.addLast(C.toCharArray()[0]);
                }
            }
        }
        StringBuilder ret = new StringBuilder();
        while(q.size() != 0) {
            ret.append(q.getFirst());
            q.removeFirst();
        }
        System.out.println(ret);
    }
}