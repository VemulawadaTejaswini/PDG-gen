import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        List<String> weekList = Arrays.asList(weeks);

        int result = 7 - weekList.indexOf(s);

        System.out.println(result);
        sc.close();
    }
}
