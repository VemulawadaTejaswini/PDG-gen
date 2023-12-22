import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        switch (S){
            case "ABC":
                System.out.println("ARC");
                break;
            case "ARC":
                System.out.println("ABC");
                break;
        }
    }
}