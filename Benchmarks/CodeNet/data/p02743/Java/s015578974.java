import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(c>a+b&&4*a*b<Math.pow(c-a-b,2)?"Yes":"No");
    }
}
