import java.util.*;
class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int res = 0;
        for (int i = 0; i <= N; i++) {
            if (A <= (i/10 + i%10) && (i/10 + i%10) <= B) {
                res += i;
                System.out.println(i);
            }
        }
        System.out.println("sum" + res);
    }
}