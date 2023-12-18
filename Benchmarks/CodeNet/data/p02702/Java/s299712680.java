import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String givenNum = sc.next();
        givenNum = new StringBuilder(givenNum).reverse().toString();
        int x = 1, tot = 0;
        List<Integer> cnt = new ArrayList<>(2019);
        for (int i = 0; i < 2019; i++) {
            cnt.add(0);
        }
        long ans = 0;
        for (int i = 0; i < givenNum.length(); i++) {
            cnt.set(tot, cnt.get(tot) + 1);
            tot += (givenNum.charAt(i) - '0') * x;
            tot %= 2019;
            ans += cnt.get(tot);
            x = x * 10 % 2019;
        }
        System.out.println(ans);
    }
}
