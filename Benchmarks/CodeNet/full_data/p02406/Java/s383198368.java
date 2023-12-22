import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        for(int i = 1; i <= num; i++) {
            if(i % 3 == 0 || i % 10 == 3 || Integer.toString(i).contains("3")) {
                System.out.print(" ");
                System.out.print(i);
            }
        }
        System.out.println("");
    }
}
