import java.util.*;
public class Main {
    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            cnt += (s.charAt(i)== '1' ? 1 : 0);
        }
        System.out.println(cnt);
    }
}
