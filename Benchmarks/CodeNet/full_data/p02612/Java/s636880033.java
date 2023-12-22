import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int ret = n % 1000;
        if(ret > 0) {
            ret = 1000 - ret;
        }

        System.out.println(String.valueOf(ret));
    }
}