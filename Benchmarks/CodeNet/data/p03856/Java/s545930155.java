import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        while (!s.isEmpty()){
            if (s.endsWith("dream")) s = s.replaceFirst("dream$", "");
            else if (s.endsWith("dreamer")) s = s.replaceFirst("dreamer$", "");
            else if (s.endsWith("erase")) s = s.replaceFirst("erase$", "");
            else if (s.endsWith("eraser")) s = s.replaceFirst("eraser$" ,"");
            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
