import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int last = 9;
        for(int i = 0; i < 5; i++){
            int input = sc.nextInt();
            ans += (input - 1) / 10 + 1;
            last = input % 10 == 0 ? last : Math.min(last, input % 10);
        }
        ans *= 10;
        ans -= 10 - last;
        System.out.println(ans);
    }
}