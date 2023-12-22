import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int orderNum = scan.nextInt();
        int a = 0;
        int b = 0;

        for (int i = 0; i < orderNum; i++){
            String order = scan.next();

            if (order.equals("print")){
                a = scan.nextInt();
                b = scan.nextInt();

                String printResult = str.substring(a, b + 1);
                System.out.println(printResult);
            }

            if (order.equals("reverse")){
                a = scan.nextInt();
                b = scan.nextInt();

                char[] strReverse = str.toCharArray();

                for (int j = 0; j < b - a; j++){
                    char tmp = strReverse[j + a];
                    strReverse[j + a] = strReverse[b - j];
                    strReverse[b - j] = tmp;
                }
                str = String.valueOf(strReverse);
            }

            if (order.equals("replace")){
                a = scan.nextInt();
                b = scan.nextInt();
                String strReplaceWord = scan.next();
                char[] strReplace = str.toCharArray();
                char[] strReplaceWordChara = strReplaceWord.toCharArray();

                for (int j = 0; j < strReplaceWordChara.length; j++){
                	strReplace[a + j] = strReplaceWordChara[j];
                }
                str = String.valueOf(strReplace);
            }
        }
        scan.close();
    }
}