import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();

        if(a >= 3200){
            System.out.println(s);
        }else{
            System.out.println("red");
        }


    }
    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}