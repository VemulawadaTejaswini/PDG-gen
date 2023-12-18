import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] s = scan.nextLine().toCharArray();
        int length = s.length;
        List<Character> non_n = new ArrayList<>();
        for( char tmp : s) {
            if (tmp != 'x') {
                non_n.add(tmp);
            }
        }
        int x_num = length - non_n.size();

        for (int i = 0; i < non_n.size(); i++) {
            if (!non_n.get(i).equals(non_n.get(non_n.size() - i - 1))) {
                System.out.println("-1");
                return;
            }
        }

        int count = 0;
        List<Character> result = new ArrayList<>();
        for(char tmp : s) {
            result.add(tmp);
        }
        for (int i = 0; i < result.size() / 2;) {
            char head = result.get(i);
            char tail = result.get(result.size() - 1 - i);
            if(head == tail) {
                i++;
                continue;
            }
            count++;
            if(head == 'x') {
                result.add(result.size() - i, 'x');
            } else  {
                result.add(i, 'x');
            }
        }
        System.out.println(count);
    }
}
