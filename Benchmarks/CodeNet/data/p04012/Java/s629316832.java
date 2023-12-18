import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if(a[i] % 2 != 0){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
