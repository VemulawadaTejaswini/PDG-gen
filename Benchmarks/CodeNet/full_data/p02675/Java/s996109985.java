import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        int index = n.length() - 1;
        int num = (int)n.charAt(index) - 48;
        if (
                num == 2 ||
                num == 4 ||
                num == 5 ||
                num == 7 ||
                num == 9){
            System.out.println("hon");
        } else if (
                num == 0 ||
                num == 1 ||
                num == 6 ||
                num == 8){
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }
    }
}