import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        sc.close();
        Deque<Integer> q = new ArrayDeque<>();
        for (char x : s) {
            if (q.isEmpty() && x == 'B') {
                // nothing
            } else if (x == 'B') {
                q.pop();
            } else {
                q.push(x - 48);
            }
        }
        for (int i : q) {
            System.out.print(i);
        }
        System.out.println();
    }
}