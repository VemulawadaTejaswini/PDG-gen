import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for(int i = 0;i < n;i++){
            ans *= sc.nextLong();
        }
        System.out.println(ans <= 1000000000000000000L? ans : -1);
    }
}