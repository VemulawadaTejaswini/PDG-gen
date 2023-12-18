import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.length() % 2 != 0){ 
            System.out.println("No");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(i % 2 == 0 && str.charAt(i) != 'h'){ 
                System.out.println("No");
                return;
            }
            if(i % 2 != 0 && str.charAt(i) != 'i'){ 
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
