
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
        Map<String, Integer> map = new HashMap<>();
        Map<Character, Boolean> flg = new HashMap<>();

        for (int i = 0; i < S.length() - 2; i++) {
            if(flg.containsKey(S.charAt(i))){
                continue;
            }else{
                flg.put(S.charAt(i), true);
            }
            for (int j = i + 1; j < S.length() - 1; j++) {
                for (int k = j + 1; k < S.length(); k++) {
                    map.put(S.charAt(i) + String.valueOf(S.charAt(j)) + S.charAt(k), 1);

                }
            }
        }
        System.out.println(map.size());
    }
}
