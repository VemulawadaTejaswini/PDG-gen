import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();

        int max = N / 2;
        for(int i = max; i > 0; i--) {
            Map<String, Integer> map = new HashMap<>();
            for(int j = 0; j+i <= S.length(); j++){
                String sub = S.substring(j, j+ i);
                if(map.containsKey(sub)) {
                    Integer val = map.get(sub);
                    if(val <= j) {
                        System.out.println(i);
                        return;
                    }
                }
                map.put(sub, j + i);
            }
        }
        System.out.println(0);
    }
}