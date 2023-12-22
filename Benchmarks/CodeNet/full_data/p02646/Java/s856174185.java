import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a, v, b, w, t;
        a = scn.nextInt();
        v = scn.nextInt();
        b = scn.nextInt();
        w = scn.nextInt();
        t = scn.nextInt();

        int dis = Math.abs(b - a);
        int ch = v - w;
        if (ch <= 0) {
            System.out.println("NO");
        } else {
            if (dis <= (ch * t)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        scn.close();

    }

}