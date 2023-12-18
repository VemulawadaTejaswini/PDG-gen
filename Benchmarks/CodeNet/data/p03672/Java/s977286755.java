import java.util.*;



/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        for (int i = 0; i < s.length() / 2; i++) {
//            System.out.println(s.substring(0, s.length() / 2 - i - 1));
//            System.out.println(s.substring(s.length() / 2 - i - 1,s.length() - 2 * i - 2));
            if(s.substring(0, s.length() / 2 - i - 1).equals(s.substring(s.length() / 2 - i - 1,s.length() - 2 * i - 2))){
                System.out.println(s.length() - (i + 1) * 2);

                break;
            }
        }


    }






} // MainClass
