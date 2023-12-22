import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] answer = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLowerCase(c)) {
                answer[i] = (Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                answer[i] = (Character.toLowerCase(c));
            } else
                answer[i] = c;
        }
        System.out.println(answer);
    }
}

