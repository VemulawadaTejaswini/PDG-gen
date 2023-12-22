import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> l = new HashMap<>();
        l.put('I', 1);
        l.put('V', 5);
        l.put('X', 10);
        l.put('L', 50);
        l.put('C', 100);
        l.put('D', 500);
        l.put('M', 1000);
        while (sc.hasNext()) {
            char[] line = sc.next().toCharArray();
            int sum = l.get(line[0]);
            for (int i = 1; i < line.length; i++) {
                if (l.get(line[i - 1]) < l.get(line[i])) {
                    sum += l.get(line[i]) - l.get(line[i - 1])*2;
                }else {
                    sum += l.get(line[i]);
                }
            }
            System.out.println(sum);
        }
    }
}
