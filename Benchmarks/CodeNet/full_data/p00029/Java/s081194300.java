import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        String maxStr = "";
        for (int i = 0; i < str.length; i++) {
            if (!map.containsKey(str[i])) map.put(str[i], 0);

            map.put(str[i], map.get(str[i]) + 1);

            if (maxStr.length() < str[i].length()) {
                maxStr = str[i];
            }
        }

        Map.Entry<String, Integer> mapEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (mapEntry == null || entry.getValue().compareTo(mapEntry.getValue()) > 0) mapEntry = entry;
        }

        System.out.printf("%s %s\n", mapEntry.getKey(), maxStr);
    }
}