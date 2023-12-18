import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        System.out.println(Math.max(a,b) + Math.max(Math.max(a, b)-1, Math.min(a,b)));
    }
}
