import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        if(H%3 == 0 || W%3 == 0){
            System.out.println(0);
            return;
        }
        int ans = Math.min(H, W);
        for(int h = 1;h < H;h++){
            int l = 1;
            int h1 = Math.max(h, H-h);
            int h2 = Math.min(h, H-h);
            int d = h1*(W-2);
            l += d/(W+h1);
            ans = Math.min(ans, H*(W-l)-h2*l);
            l++;
            ans = Math.min(ans, h1*l-H*(W-l));
            ans = Math.min(ans, l*(h1-h2));
            ans = Math.min(ans, Math.abs((H-h)*W-h*(W/2)));
            ans = Math.min(ans, Math.abs((H-h)*W-h*((W+1)/2)));
        }
        System.out.println(ans);
    }
}