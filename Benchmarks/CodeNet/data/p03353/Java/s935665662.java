import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int K = scanner.nextInt();

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < 6; j++) {
                if (i + j > s.length()) {
                    break;
                }

                String sub = s.substring(i, i + j);
                if (!strings.contains(sub)) {
                    strings.add(sub);
                }
            }
        }

        // sort
        Collections.sort(strings);
        String[] output = new String[5];
        for (int i = 0; i < 6; i++) {
            String min = "";
            for (String string : strings) {
                if (string.compareTo(min) < 0) {
                    min = string;
                }
                strings.remove(string);
            }
            output[i] = min;
        }

        System.out.print(output[K - 1]);
    }
}
