import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float ans = 0;
        for(int i = 0; i < n; i++){
            float x = sc.nextFloat();
            String u = sc.next();
            if(u.equals("BTC")){
                x *= 380000;
            }
            ans += x;
        }
        System.out.println(ans);
    }
}
