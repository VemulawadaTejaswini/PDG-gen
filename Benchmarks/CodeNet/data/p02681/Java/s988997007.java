import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();

        String z = t.substring(0, t.length()-1);

        if(s.equals(z)){
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }

        scan.close();
    }
}