import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int h = inp.nextInt();
        int ans = (a + b) * h / 2;
        System.out.println(ans);
    }
}