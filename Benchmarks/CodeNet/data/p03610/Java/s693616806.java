import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(),ans = "";
        for (int i = 0; i < a.length(); i+=2) {
            ans += a.substring(i,i+1);
        }
        System.out.println(ans);
    }
}
