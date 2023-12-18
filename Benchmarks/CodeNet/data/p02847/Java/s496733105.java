import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String today = sc.next();
        
        String[] weekdays = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        List<String> weekdayList = Arrays.asList(weekdays);
        int i = weekdayList.indexOf(today);

        System.out.println(7 - i);
    }
}
