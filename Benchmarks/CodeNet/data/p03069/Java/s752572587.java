import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        String str = sc.next();
        String value1 = "#";
        String value2 = ".";
        int value1Count = 0;
        int value2Count = 0;
        int ans = 0;

        String tmpValue = "";
        for (int i = 0; i < str.length(); i++) {
            tmpValue = String.valueOf(str.charAt(i));
            if (!tmpValue.equals(value1)) {
                value1Count++;
            } else {
                value2Count++;
            }
        }
        
        if (value1Count >= value2Count) {
            ans = value2Count;
        } else {
            ans = value1Count;
        }
        System.out.println(ans);
    }
}
