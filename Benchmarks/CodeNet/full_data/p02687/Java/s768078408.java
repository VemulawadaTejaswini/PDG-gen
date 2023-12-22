
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String sr;
        Scanner scan = new Scanner(System.in);
        sr = scan.nextLine();
        scan.close();

        if(sr == "ABC"){
            System.out.println("ARC");
        } else {
            System.out.println("ABC");
        }
    }
}