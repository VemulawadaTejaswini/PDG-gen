import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        Arrays.sort(s);
        Arrays.sort(t);

        String ans = null;

        for (int i = 0; i < s.length && i < t.length; i ++){
            if (s[i] < t[i]){
                ans = "Yes";
                //System.out.println("1 :" + i);
                break;
            }else if (s[i] > t[i]){
                ans = "No";
                //System.out.println("2 :" + i);
                break;
            }
        }
        if (ans==null && s.length < t.length){
            ans = "Yes";
            // System.out.println("3");
        }else {
            ans = "No";
            // System.out.println("4");
        }

        System.out.println(ans);

    }
}
