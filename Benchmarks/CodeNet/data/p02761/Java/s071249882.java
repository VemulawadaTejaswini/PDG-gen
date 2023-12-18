import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer M = Integer.parseInt(scanner.next());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < M; i++) {
            Integer S = Integer.parseInt(scanner.next());
            Integer C = Integer.parseInt(scanner.next());
            Integer num = map.get(S);
            if(num== null || num == C) {
                map.put(S,C);
            } else {
                System.out.println(-1);
                System.exit(0);
            }
        }

        boolean first = true;
        String result = new String();
        for (int i = 1; i <= N; i++) {
            Integer check = map.get(i);
            if(map.get(1) == 0) {
                System.out.println(-1);
                System.exit(0);
            } else if(check == null && first) {
                result += "1";
            } else {
                if(check == null)  check = 0;
                result += check;
            }
            first = false;
        }

        System.out.println(result);
    }
}
