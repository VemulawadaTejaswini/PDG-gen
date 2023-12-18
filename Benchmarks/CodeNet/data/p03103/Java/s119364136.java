import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Long,Integer> map = new TreeMap<>();

        String temp = sc.nextLine();

        String[] tempArr = temp.split(" ");

        int N = Integer.parseInt(tempArr[0]);
        int M = Integer.parseInt(tempArr[1]);

        for (int i = 0; i < N; i++) {
            temp = sc.nextLine();
            tempArr = temp.split(" ");
            map.put(Long.parseLong(tempArr[0]),Integer.parseInt(tempArr[1]));
        }

        long tp = 0L;
        for (Map.Entry<Long,Integer> set : map.entrySet()) {
            if (set.getValue() < M) {
                tp += (long) (set.getValue() * set.getKey());
                M -= set.getValue();
            } else {
                tp += (long) set.getKey() * M;
                break;
            }
        }

        System.out.println(tp);
    }

}