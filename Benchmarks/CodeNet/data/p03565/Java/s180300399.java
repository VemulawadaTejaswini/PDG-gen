import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int N;
        String a = sc.nextLine();
        String b = sc.nextLine();
        // System.out.println(a+" "+b);

        int a_len = a.length();
        int b_len = b.length();
        int after_flg = 0;
        String ans = a;

        for (int i = 0; i < a_len - b_len + 1; i++){

            // System.out.println(a.charAt(i));
            // if (b.contains(String.valueOf(a.charAt(i)))) {
                // System.out.println("yes:"+a.charAt(i));
            // }
            String substr = a.substring(i,i+b_len);
            // System.out.println(substr);
            // System.out.println(b);
            // System.out.println("======");
            int ikeru = 0;
            for (int j = 0; j<b_len; j++){
                // System.out.println(substr.charAt(j));
                // System.out.println(b.charAt(j));
                // char tmp = substr.charAt(j);

                if ((substr.charAt(j) != b.charAt(j)) && '?' != substr.charAt(j)) {
                    // System.out.println("muri");
                    break;
                }
                if ((substr.charAt(j) == b.charAt(j)) || '?' == substr.charAt(j)) {
                    // System.out.println("ikeru");
                    ikeru++;
                }
            }
            if (ikeru == b_len){
                after_flg = 1;
                ans = ans.replace(a.substring(i,i+b_len),b);
                break;
            }

        }
        if (after_flg == 0) System.out.println("UNRESTORABLE");
        else {
            ans = ans.replace("?","a");
            System.out.println(ans);
        }
        // str.replace("1","3");
        // return a;
    }
}
