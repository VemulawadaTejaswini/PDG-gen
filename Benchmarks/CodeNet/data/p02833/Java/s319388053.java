
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int res = factorial(n);
        String str = Integer.toString(res);
        String s = str.replaceAll("[1-9]","");
        System.out.println(s.length()-1);
    }
    public static int factorial(int a){
        return (a<2)?1:a*factorial(a-2);
    }
}