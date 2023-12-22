import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if (x < 600) {
            System.out.println("8");
        } else if (x < 800) {
            System.out.println("7");
        } else if (x < 1000) {
            System.out.println("6");
        } else if (x < 1200) {
            System.out.println("5");
        } else if (x < 1400) {
            System.out.println("4");
        } else if (x < 1600) {
            System.out.println("3");
        } else if (x < 1800) {
            System.out.println("2");
        } else{
            System.out.println("1");
        }
        
    }
}
