import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] check = { "this", "that", "the" };
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String newText = str;
            end: for (int i = 0; i < 26; i++) {
                for (int j = 0; j < check.length; j++) {
                    if (newText.contains(check[j])) {
                        System.out.println(newText);
                        break end;
                    }
                }
                newText = newLine(newText);
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
