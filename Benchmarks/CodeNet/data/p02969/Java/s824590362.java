import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ans = (int)Math.pow(num, 2) * 3;

        System.out.println(ans);
    }
}