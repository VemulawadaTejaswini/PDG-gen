import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            String answer = "";
            int length = line.length();
            for (int i = 0; i < length; i++) {
                char ch = line.charAt(i);
                if(Character.isLowerCase(ch))
                    answer = line.toUpperCase();
                else if(Character.isUpperCase(ch))
                    answer= line.toLowerCase();
            }
            System.out.println(answer);
        }
    }
}
