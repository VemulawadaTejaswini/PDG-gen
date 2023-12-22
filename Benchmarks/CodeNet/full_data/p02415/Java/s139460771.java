import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
try (Scanner sc = new Scanner(System.in)) {
String line = sc.nextLine();
String answer = "";
int length = line.length();
for (int i = 0; i < length; i++) {
char ch = line.charAt(i);
// Character.isLowerCase で小文字かどうか判断可能
// Character.toUpperCase, Character.toLowerCase で変換
// 記号は上記メソッドで変換にかけても変化しない
if(Character.isLowerCase(ch)==true)answer+=Character.toUpperCase(ch);
else if(Character.isUpperCase(ch)==true)answer+=Character.toLowerCase(ch);
else answer+=ch;
}
System.out.println(answer);
}
}
}

