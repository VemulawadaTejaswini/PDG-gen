import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a, b, c;
        String s = "";
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b && b < c) {
            s += "Yes";
        } else {
            s += "No";
        }
        System.out.println(s);
       }
}
