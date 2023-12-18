import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
        int dest = s.indexOf("B");
        int index = dest + 1;
        int nowIndex;
        while ((nowIndex = s.indexOf("W", index)) > 0) {
            ans += nowIndex - dest++;
            index = nowIndex + 1;
        }
        System.out.println(ans);
    }
}