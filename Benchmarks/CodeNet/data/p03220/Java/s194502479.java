import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt(), a = sc.nextInt(), x=0;
        double ans = 100000;
        for(int i=0;i<n;i++){
            int h = sc.nextInt();
            if(Math.abs(a - (t - h * 0.006)) < ans){
                ans = Math.abs(a - (t - h * 0.006));
                x = i;
            }
        }
        System.out.println(x + 1);
    }
}