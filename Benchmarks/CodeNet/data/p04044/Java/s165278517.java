import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wild on 2016/07/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int len = scan.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < str.length; i++){
            str[i] = scan.next();
        }

        Arrays.sort(str);
        for (String tmp: str) System.out.print(tmp);
    }
}