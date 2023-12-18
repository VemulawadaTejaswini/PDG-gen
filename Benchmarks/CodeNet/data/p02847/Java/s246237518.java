import java.util.HashMap;
import java.util.Scanner;


// 146_a
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("SUN", 7);
        map.put("MON", 6);
        map.put("TUE", 5);
        map.put("WED", 4);
        map.put("THU", 3);
        map.put("FRI", 2);
        map.put("SAT", 1);

        System.out.println(map.get(s));

    }

}
