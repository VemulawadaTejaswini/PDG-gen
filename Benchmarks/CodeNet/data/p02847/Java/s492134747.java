import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("SUN", 7);
        hs.put("MON", 6);
        hs.put("TUE", 5);
        hs.put("WED", 4);
        hs.put("THU", 3);
        hs.put("FRI", 2);
        hs.put("SAT", 1);
        String s = sc.next();
        System.out.println(hs.get(s));
        sc.close();
    }
}
