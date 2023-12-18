import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x;
        if (a > b) {
            x = a * 2 -1;
        }else if(a < b){
            x = b * 2 -1;
        }else {
            x = a*2;
        }
        p(x);
    }

    private static void p(Object x) {
        System.out.println(x.toString());
    }
}
