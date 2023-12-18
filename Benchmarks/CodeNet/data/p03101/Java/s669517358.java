import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int ans;
        ans = num1 * num2 - num3 * num2 - num4 * num1 + num3 * num4;

        System.out.println(ans);
    }
}