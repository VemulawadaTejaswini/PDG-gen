import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main(args);
    }

    public Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String stra = a(a, b);
        String strb = a(b, a);
        System.out.print(stra.compareTo(strb) > 0 ? stra:strb);
    }

    String a(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = "";
        for (int i=0;i<b;i++) {
            str2 = String.join(str2, str1);
        }
        return str2;
    }
}