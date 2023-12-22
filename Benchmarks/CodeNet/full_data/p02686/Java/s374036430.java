import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String[] list = new String[N];
        for (int i = 0; i < N; i++) {
            list[i] = scan.next();
        }
        for (int i = 0; i < N; i++) {
            char[] d = list[i].toCharArray();
            int len = d.length;
            StringBuilder sb = new StringBuilder();
            int current = 0;
            int size = 0;
            while (current < len) {
                if (d[current] == '(') {
                    sb.append(d[current]);
                    current += 1;
                    size += 1;
                    continue;
                }
                if (sb.length() == 0) {
                    sb.append(d[current]);
                    current += 1;
                    size += 1;
                    continue;
                }
                char x = sb.charAt(size-1);
                if (x == '(') {
                    sb.deleteCharAt(size-1);
                    current += 1;
                    size -= 1;
                    continue;
                }
                sb.append(d[current]);
                current += 1;
                size += 1;
            }
            list[i] = sb.toString();
        }
        List<Word> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if ("".equals(list[i])) {
                continue;
            }
            Word word = new Word(list[i]);
            words.add(word);
        }
        words.sort(new WordComparator());
        int len = words.size();
        int left_length = 0;
        boolean ng = false;
        for (int i = 0; i < len; i++) {
            Word word = words.get(i);
            if (left_length < word.right_length) {
                ng = true;
                break;
            }
            left_length -= word.right_length;
            left_length += word.left_length;
        }
        if (left_length != 0) {
            ng = true;
        }
        if (ng) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
    class WordComparator implements Comparator<Word> {
        @Override
        public int compare(Word o1, Word o2) {
            if (o1.left_start != o2.left_start) {
                return -Integer.compare(o1.left_start, o2.left_start);
            }
            if (o1.right_end != o2.right_end) {
                return Integer.compare(o1.right_end, o2.right_end);
            }
            if (o1.power != o2.power) {
                return -Integer.compare(o1.power, o2.power);
            }
            if (o1.left_length != o2.left_length) {
                return -Integer.compare(o1.left_length, o2.left_length);
            }
            return Integer.compare(o1.right_length, o2.right_length);
        }
    }
    class Word {
        String S;
        int power;
        // (
        int left_length;
        // )
        int right_length;
        // 1 end (
        int left_start;
        // 1 end )
        int right_end;
        Word(String S) {
            char[] d = S.toCharArray();
            int len = d.length;
            int left_length = 0;
            int left_start = d[0] == '(' ? 1 : 0;
            int right_length = 0;
            int right_end = d[len-1] == ')' ? 1 : 0;
            for (int i = 0; i < len; i++) {
                if (d[i] == '(') {
                    left_length += 1;
                    continue;
                }
                right_length += 1;
            }
            this.S = S;
            this.left_length = left_length;
            this.left_start = left_start;
            this.right_length = right_length;
            this.right_end = right_end;
            this.power = this.left_length - this.right_length;
        }
    }

}

