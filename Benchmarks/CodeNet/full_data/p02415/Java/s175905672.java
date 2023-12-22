import java.util.Scanner;
import java.lang.Character;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            char tmp = line.charAt(i);
            if(Character.isUpperCase(tmp)) {
                tmp = Character.toLowerCase(tmp);
            } else if (Character.isLowerCase(tmp)) {
                tmp = Character.toUpperCase(tmp);
            }
            System.out.print(tmp);
        }
        System.out.println();
    }
}
