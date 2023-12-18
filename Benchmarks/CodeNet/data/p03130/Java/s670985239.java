import java.util.*;
import java.util.stream.Collectors;

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            List<Integer> list = Arrays.asList(
                    Integer.parseInt(scan.next()),
                    Integer.parseInt(scan.next()),
                    Integer.parseInt(scan.next()),
                    Integer.parseInt(scan.next()),
                    Integer.parseInt(scan.next()),
                    Integer.parseInt(scan.next())
            );

            Map<Integer, Long> map = list.stream().collect(
                    Collectors.groupingBy(x -> x, Collectors.counting())
            );

            boolean flg = false;
            for (Long val : map.values()) {
                if(val > 2) flg = true;
            }

            if(flg) System.out.println("No");
            else System.out.println("Yes");
        }

}