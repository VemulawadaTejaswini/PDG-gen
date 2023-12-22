import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    static Scanner in;

    void solve() {
        String s = in.nextLine();
        Deque<Integer> q1 = new ArrayDeque<>();
        Deque<Pair> q2 = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '\\') {
                q1.push(i);
            }else if(c == '/' && q1.size() > 0) {
                int j = q1.pop();
                int a = i - j;
                sum += a;
                while(q2.size() > 0 && q2.getFirst().first > j) {
                    a += q2.pop().second;
                }
                q2.push(new Pair(j, a));
            }
        }
        System.out.println(sum);
        System.out.print(q2.size());
        while(q2.size() > 0) {
            System.out.print(" " + q2.removeLast().second);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}

class Pair{
    int first, second;
    public Pair(int i, int j) {
        first = i; second = j;
    }
}