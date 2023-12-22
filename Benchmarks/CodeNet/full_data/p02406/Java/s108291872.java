import java.util.Scanner;

public class Main {
    /**
     * x???d?????????????????????
     * d????????¨????????°???
     * @return
     */
    public static boolean contain(int x, int d) {
        String s = String.format("%d", x);
        return s.contains(String.format("%d", d));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=3;i<=n;i++) {
            if((i % 3) == 0 || contain(i, 3)) {
                System.out.print(" " + i);
            }
        }
        System.out.println("");
    }
}