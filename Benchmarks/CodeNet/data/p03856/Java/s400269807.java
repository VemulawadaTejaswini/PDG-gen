import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i=0; i<50000; i++) {
            s = s.replaceFirst("(dreamer|dream|eraser|erase)$", "");
        }
        if (s.length() != 0) System.out.println("NO");
        else System.out.println("YES");

    }
}
