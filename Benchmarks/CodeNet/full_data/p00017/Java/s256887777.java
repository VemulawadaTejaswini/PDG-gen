import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] check = { "this ", "that ", "the " };
        String newText = str;
        end: for (int i = 0; i < 26; i++) {
            newText = newLine(newText);
            for (int j = 0; j < 3; j++) {
                if (newText.contains(check[j])) {
                    System.out.println(newText);
                    break end;
                }
            }
        }
    }

    static String newLine(String text) {
        String temp = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 96 && text.charAt(i) < 123)
                temp += (char) ((text.charAt(i) + 8) % 26 + 97);
            else
                temp += text.charAt(i);
        }
        return temp;
    }
}
