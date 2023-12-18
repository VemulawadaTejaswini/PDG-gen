import java.util.Scanner;

/**
 * Created by wild on 16/08/28.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] strLine = scan.next().split("");

        String tmp = null;

        for (int i = 0; i < strLine.length; i++){
            tmp = strLine[i];
            if (!nums(strLine, tmp)){
                System.out.println("No");
                break;
            }else {
                if ((i+1) == strLine.length){
                    System.out.println("Yes");
                }
            }
        }

    }

    public static boolean nums(String[] str, String detectChar){
        int count = 0;
        for (int i = 0; i < str.length; i++){
            if (detectChar.equals(str[i])){
                count++;
            }
        }

        if (count%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}