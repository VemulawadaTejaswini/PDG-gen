import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ab = sc.next() + sc.next();
        int abInt = Integer.parseInt(ab);
        
        int root = (int) Math.sqrt(abInt);
        if (root * root == abInt) {
            System.out.println("Yes");
            
        } else {
            System.out.println("No");
        }
    }
}
