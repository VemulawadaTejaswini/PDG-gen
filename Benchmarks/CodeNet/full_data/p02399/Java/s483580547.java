import java.util.*;
class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("" + (a/b) + " " + (a%b) + " " + (a/(double)b));
    }
}