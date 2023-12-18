import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


         int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean ret = (a <= c) && (b >= c);

        if (ret) {
            System.out.println ("Yes");
        } else {
            System.out.println ("No");
        }
    }
}