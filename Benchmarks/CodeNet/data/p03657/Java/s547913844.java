import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] l = {a,b,a+b};
        for (int i:l) {
            if (i%3==0) {
                System.out.println("Possible");
                sc.close();
                return;
            }
        }
        System.out.println("Impossible");
        sc.close();
    }
}