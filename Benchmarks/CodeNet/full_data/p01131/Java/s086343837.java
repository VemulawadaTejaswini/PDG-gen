import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static String[] keyBoard = { ".,!? ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static String toLetter(String str) {
        int num = Integer.parseInt(str.substring(0,1)) - 1;
        int times = str.length();
//        System.out.println("Number is: "+num+" times:"+times+" len:"+keyBoard[num].length());
        return String.valueOf(keyBoard[num].charAt((times-1)%keyBoard[num].length()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String sentence = "";
            ArrayList<String> command = new ArrayList<>();
            for (String str: sc.nextLine().split("0")) {
                command.add(str);
            }
            command.removeAll(Collections.singleton(""));
            for (String str: command) {
                sentence += toLetter(str);
            }


            System.out.println(sentence);
        }
    }
}