import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt(),ans;
        ans = x > y ? x - y : 0;
        System.out.println(ans);
    }
}
