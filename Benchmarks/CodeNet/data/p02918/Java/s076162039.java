import javax.swing.text.MutableAttributeSet;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        if(n == 1){
            System.out.println("0");
            System.exit(0);
        }
        
        List<Integer> list = new ArrayList<>();
        int index = 0;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            while (s.charAt(i) == s.charAt(i - 1)) {
                i++;
                if(i >= n){
                    break;
                }
            }
            list.add(i - index);
            ans += i - index - 1;
            index = i;
        }
        if(s.charAt(n-1) != s.charAt(n-2)){
            list.add(1);
        }

        if(list.size() % 2 == 0){
            if(((list.size()/2)-1) >= k){
                ans += k * 2;
            } else {
                ans = n-1;
            }

        } else {
            ans += Math.min(list.size()-1, k*2);
        }
        System.out.println(ans);
    }
}