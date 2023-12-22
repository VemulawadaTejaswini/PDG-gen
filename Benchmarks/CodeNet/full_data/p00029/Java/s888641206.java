import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> list = new HashMap<>();
        String[] lines = sc.nextLine().split(" ");
        int max = 0;
        int maxLength = 0;
        String maxStr = "";
        for (String s : lines) {
            if (list.containsKey(s)) {
                int count = list.get(s) + 1;
                list.put(s, count);
                max = Math.max(max, count);
            } else {
                list.put(s, 0);
                if (s.length() > maxLength) {
                    maxLength = s.length();
                    maxStr = s;
                }
            }
        }
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
                break;
            }
        }
        System.out.println(maxStr);
    }
}
