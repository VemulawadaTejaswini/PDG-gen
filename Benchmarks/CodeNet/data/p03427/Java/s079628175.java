import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        boolean flag = false;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (flag) {
                ans += 9;
            } else {
                if (arr[i] == '9') {
                    ans += 9;
                } else {
                    flag = true;
                    if (i == 0) {
                        ans += arr[i] - '0';
                        ans--;
                    } else {
                        ans += 8;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
