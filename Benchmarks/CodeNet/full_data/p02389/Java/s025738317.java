public class Rectangle {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int s = a * b;
        int r = 2 * (a + b);
        System.out.print(s);
        System.out.print(" ");
        System.out.println(r);
    }
}
