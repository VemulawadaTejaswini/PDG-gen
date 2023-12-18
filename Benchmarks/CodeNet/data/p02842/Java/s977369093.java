import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int X=0; X<50000; X++) {
            int tmp = X * 108 / 100;
//            System.out.println(String.format("%d, %d", X, tmp));
            if(N==tmp) {
                System.out.println(String.format("%d", X));
                return;
            }
        }
        System.out.println(String.format(":("));
    }
}
