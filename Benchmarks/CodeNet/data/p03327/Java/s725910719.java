import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.next();
        
        if (num.length() == 3) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
    }
}