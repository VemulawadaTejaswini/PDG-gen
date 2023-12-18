import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextDouble();
        double a = sc.nextDouble();
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 1;i <= n;i++){
            double tpr = t - sc.nextDouble()*0.006;
            int sa = (int)Math.abs(a-tpr);
            if(min > sa){
                min = sa;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
