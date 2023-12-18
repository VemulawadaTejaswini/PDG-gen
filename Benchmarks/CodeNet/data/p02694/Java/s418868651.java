
import java.lang.Math;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Math.floor(Math.log(n)/Math.log(1.01)/100));
    }
}
