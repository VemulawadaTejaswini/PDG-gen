import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        double x[][] = new double[n][d];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<d;j++){
                x[i][j] = Double.parseDouble(sc.next());
            }
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            for(int i2 = i+1;i2<n;i2++){
                double tmp = 0;
                for(int j = 0;j<d;j++){
                    tmp += Math.pow(Math.abs(x[i][j] - x[i2][j]),2);
                }
                tmp = Math.sqrt(tmp);
                if(Math.floor(tmp) == tmp){
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}