import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String pattern = "AC";
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        for (int i = 0; i < q; i++) {
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            int count = 0;
            String key = start + ":" + end;

            for (int j = start; j <= end; j++) {
                String localKey = j + ":" + end;
                if (map.containsKey(localKey)) {
                    count += map.get(localKey);
                    break;
                } else if (j != start && s.charAt(j) == 'C' && s.charAt(j-1) == 'A') {
                    count++;
                }
            }
            map.put(key, count);
            System.out.println(count);
        }
    }
}