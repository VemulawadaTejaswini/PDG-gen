import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String color = "";
            int n = ip(br);
            if (n == 0) {
                break;
            }
            Map<String, Integer> colorMap = new HashMap<>();
            String[] list=br.readLine().split(" ");

            for (String i : list) {
                if (colorMap.containsKey(i)) {
                    int count = colorMap.get(i) + 1;
                    if (count > n / 2) {
                        color =i;
                        break;
                    }
                    colorMap.put(i, count);
                } else {
                    colorMap.put(i, 1);
                }
            }
            System.out.println(color.equals("")?  "NO COLOR" :color);
        }
    }

    static int greateCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            int c = Math.max(a, b);
            b = Math.min(a, b);
            a = c;
            return greateCommonDivisor(b, a % b);
        }
    }

    static boolean isNumber(String num) {
        return Pattern.compile("^\\-?[0-9]*\\.?[0-9]+$").matcher(num).find();
    }

    static int[] createListInt(BufferedReader br) throws IOException {
        String[] lines = br.readLine().split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static int ip(BufferedReader s) throws IOException {
        return Integer.parseInt(s.readLine());
    }
}