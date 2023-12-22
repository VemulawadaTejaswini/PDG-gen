import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        for(int tsuru=0; tsuru<=X; tsuru++) {
            int kame = X - tsuru;
            int leg = kame * 4 + tsuru *2;
            if(leg==Y) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.printf("No");
    }
}
