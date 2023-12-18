import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("[753]");
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            int count = 0;
            for (int i = 357; i <= input; i += 2) {
                String s = String.valueOf(i);
                if (s.contains("7") && s.contains("5") && s.contains("3")) {
                    Matcher matcher = p.matcher(s);
                    String r = matcher.replaceAll("");
                    if (r.isEmpty()) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}