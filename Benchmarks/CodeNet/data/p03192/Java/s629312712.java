import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        int ans = 0;
        for (int i = 0; i < n.length(); i++){
            if (n.charAt(i) == '2'){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}