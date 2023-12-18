import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        while (!s.isEmpty()){
            if (s.endsWith("dream")) s = s.substring(0, s.length() - "dream".length());
            else if (s.endsWith("dreamer")) s = s.substring(0, s.length() - "dreamer".length());
            else if (s.endsWith("erase")) s = s.substring(0, s.length() - "erase".length());
            else if (s.endsWith("eraser")) s = s.substring(0, s.length() - "eraser".length());
            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}