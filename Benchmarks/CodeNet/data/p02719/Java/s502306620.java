import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x;
        while(true) {
            x = n > k ? n - k : k - n;
            n = x;
            if (x <= 1)
            {
                break;
            }
        }
        System.out.println(x);
    }
}
