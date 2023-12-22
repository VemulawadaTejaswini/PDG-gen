import java.util.Scanner;

/**
 * Description ：
 *
 * @author poyun
 * @version V1.0.0
 * @since 1.0
 * date 2020/5/10
 */
public class Main {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t = input.nextLine();
        System.out.println(compare(s,t));
    }


    public static String compare(String S , String T){
        char[] chars1 = S.toCharArray();
        char[] chars2 = T.toCharArray();
        if(chars1.length>=chars2.length) return "No";
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i]!=chars2[i]) return "No";
        }
        return "Yes";
    }
}
