import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ab1 = getLine().split(" ");
        String[] ab2 = getLine().split(" ");
        String[] ab3 = getLine().split(" ");

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<2; i++ ) {
            Integer count;
            count = map.getOrDefault(toInt(ab1[i]), 0) + 1;
            map.put(toInt(ab1[i]), count++);
            count = map.getOrDefault(toInt(ab2[i]), 0) + 1;
            map.put(toInt(ab2[i]), count++);

            count = map.getOrDefault(toInt(ab3[i]), 0) + 1;
            map.put(toInt(ab3[i]), count++);
        }

        int count1 = 0;
        int count2 = 0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()) {
            int count = e.getValue();
            if(count == 1) {
                count1++;
            }
            if(count == 2) {
                count2++;
            }
        }

        if(count1 == 2 && count2 == 2) {
            print("YES");
        } else {
            print("NO");
        }
    }

    public static int getInt() {
        return scan.nextInt();
    }

    public static String getLine() {
        return scan.nextLine();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static long toLong(String str) {
        return Long.parseLong(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
