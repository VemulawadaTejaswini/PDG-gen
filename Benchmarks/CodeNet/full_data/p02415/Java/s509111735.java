import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            String answer = "";
            int length = line.length();
            for (int i = 0; i < length; i++) {
            char ch = line.charAt(i); // 文字列(line)からi番目の文字を取り出す
            // Character.isLowerCase で小文字かどうか判断可能
            // Character.toUpperCase, Character.toLowerCase で変換
            // 記号は上記メソッドで変換にかけても変化しない
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }else{
                ch = Character.toLowerCase(ch);
            }

            answer = answer + ch; 
            }
            System.out.println(answer);
            }
    }
}
