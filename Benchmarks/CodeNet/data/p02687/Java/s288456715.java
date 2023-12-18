import java.lang.Math;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        char ni = x.charAt(1);

        if(ni == "R"){
            System.out.print("ABC");
        }else{
            System.out.print("ARC");
        }

        System.out.print(x);
    }
}