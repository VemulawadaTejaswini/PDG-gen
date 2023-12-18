import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<String, Integer> weeks = new HashMap<>();
        weeks.put("SUN", 7);
        weeks.put("MON", 6);
        weeks.put("TUE", 5);
        weeks.put("WED", 4);
        weeks.put("THU", 3);
        weeks.put("FRI", 2);
        weeks.put("SAT", 1);
        System.out.println(weeks.get(S));
    }
}
