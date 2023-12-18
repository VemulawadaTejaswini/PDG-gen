/**
 * Created by sonetsuyoshi on 2015/09/11.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] chs = sc.next().toCharArray();
        boolean[] isOdds = new boolean[26];

        for(char ch: chs) {
            int index = ch - 'a';
            isOdds[index] = !isOdds[index];
        }

        for(boolean isOdd: isOdds) {
            System.out.println(isOdd);
        }

        boolean isNotBeautiful = false;

        if(!isNotBeautiful) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}