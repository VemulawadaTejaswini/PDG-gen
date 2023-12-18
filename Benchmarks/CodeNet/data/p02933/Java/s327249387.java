import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int a = stdIn.nextInt();
        String s = stdIn.next();

        if(a >= 3200){
            System.out.println(s);
        }else{
            System.out.println("red");
        }
    }
}