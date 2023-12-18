import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '0') {
                sb.append(0);
            } else if (c == '1') {
                sb.append("1");
            } else if (c == 'B') {
                if (sb.length() > 0)  {
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
