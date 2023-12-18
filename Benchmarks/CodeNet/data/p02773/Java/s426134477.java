import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        Map<String, Integer> res = new HashMap<>();

        int maxCnt = 0;
        for(int i=0;i<N;i++){
            String s = sc.next();
            res.putIfAbsent(s, 0);
            res.put(s, res.get(s)+1);
            maxCnt = Math.max(res.get(s),maxCnt);
        }
        final int mx = maxCnt;
        res.entrySet().stream()
                .filter(ent->ent.getValue() == mx)
                .map(Map.Entry::getKey)
                .sorted()
                .forEach(System.out::println);

    }
}