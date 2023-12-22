import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double ans;
        
        int sho = (H * 60 + M) * 360 / ( 12 * 60 );
        int lon = M * 360 / 60;
        double ang;
        
        ang = Math.max(sho, lon) - Math.min(sho, lon);
        
        ans = Math.sqrt((double)A * (double)A + (double)B * (double)B 
                - 2 * (double)A * (double)B * Math.cos(Math.toRadians(ang)));
        
        System.out.print(ans);
    }
}