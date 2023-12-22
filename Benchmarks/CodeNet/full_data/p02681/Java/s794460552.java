import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String s = scanner.nextLine();

        if(n.equals(s.substring(0, s.length() - 1))){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

}