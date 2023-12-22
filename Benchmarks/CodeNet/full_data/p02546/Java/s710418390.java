import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        if(!(len > 0)){
            return;
        }
        String lastChar = String.valueOf(word.charAt(len - 1));
        String toAppend = "s";
        if(lastChar.equals("s")){
            toAppend = "es";
        }
        System.out.println(word+toAppend);
    }
}
