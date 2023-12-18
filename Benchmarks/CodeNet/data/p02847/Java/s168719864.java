import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.nextLine();
        switch (S) {
            case "MON":
                System.out.println(1); break;
            case "TUE":
                System.out.println(2); break;
            case "WED":
                System.out.println(3); break;
            case "THU":
                System.out.println(4); break;
            case "FRI":
                System.out.println(5); break;
            case "SAT":
                System.out.println(6); break;
            case "SUN":
                System.out.println(7); break;
        }
    }
}