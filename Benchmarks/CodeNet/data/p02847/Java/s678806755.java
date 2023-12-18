import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String today = sc.next();

        String[] weekdays = { "SUN", "SAT", "FRI", "THU", "WED", "TUE", "MON" };
        List<String> weekdayList = Arrays.asList(weekdays);
        int i = weekdayList.indexOf(today);

        System.out.println(i);
    }
}