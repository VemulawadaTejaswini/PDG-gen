import java.util.*;

class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int r = s.nextInt();
        int result = (int) (Math.pow(r, 2));

        System.out.println(result);
    }
}