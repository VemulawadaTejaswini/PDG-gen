import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int aOriginMin = (int)Math.ceil(a / 0.08);
        int aOriginMax = (int)Math.ceil((a+1) / 0.08)-1;
        int bOriginMin = (int)Math.ceil(b / 0.10);
        int bOriginMax = (int)Math.ceil((b+1) / 0.10)-1;
        int ans = -1;
        if(bOriginMax>=aOriginMin && aOriginMax>=bOriginMin) {
            ans = aOriginMin;
        }
        System.out.println(ans);
    }
}
