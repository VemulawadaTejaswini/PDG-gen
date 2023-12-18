import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.next();
        if (!inputStr.equals(" ") && inputStr.length()>=4){
            System.out.println(inputStr.substring(0,4)+" "+inputStr.substring(4));
        }
    }
}