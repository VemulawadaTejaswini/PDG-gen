
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int x = In.nextInt();
        System.out.println(x+(n-x)+x+x+(n-2*x)*3);
    }

}