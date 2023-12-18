import java.util.Scanner;

public class Numelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String a = scanner.next();
        String b = scanner.next();

        if(a.charAt(0) == b.charAt(0)){
            System.out.println("=");
        }else if(a.charAt(0) < b.charAt(0)){
            System.out.println("<");
        }else{
            System.out.println(">");
        }


    }
}
