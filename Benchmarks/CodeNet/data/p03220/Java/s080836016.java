import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = Integer.parseInt(sc.next());
        }
        
        double min = 10000;
        int ans = 0;
        for(int i = 0; i < n; i++){
            double j = t - h[i]*0.006;
            if(Math.abs(a-j) < min){
                min = Math.abs(a-j);
                ans = i+1;
            }
        }
        
        System.out.println(ans);
    }
}