import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            List<Integer> m_f_r = Stream.of(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            if (m_f_r.stream().allMatch(i -> i == -1)) {
                break;
            }
            int m_f = m_f_r.get(0) + m_f_r.get(1);
            int r = m_f_r.get(2);
            if (m_f >= 80) {
                System.out.println('A');
            } else if(m_f >= 65) {
                System.out.println('B');
            } else if (m_f >= 50 || r >= 50) {
                System.out.println('C');
            } else if (m_f >= 30) {
                System.out.println('D');
            } else {
                System.out.println('F');
            }
        }
    }
}


