
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            String str = sc.next();
            for (int i = 0; i < str.length(); i++){
                if (Character.isUpperCase(str.charAt(i))){
                    System.out.print(Character.toLowerCase(str.charAt(i)));
                } else if (Character.isLowerCase(str.charAt(i))){
                    System.out.print(Character.toUpperCase(str.charAt(i)));
                } else {
                    System.out.print(str.charAt(i));
                }
            }
            if (sc.hasNext())
                System.out.print(" ");
            else
                break;
        }
        System.out.println();
    }
}

