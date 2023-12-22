
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if(a.charAt(0)>='A'&&a.charAt(0)<='Z') System.out.println('A');
        else if(a.charAt(0)>='a'&&a.charAt(0)<='z') System.out.println('a');
    }
}
