import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

	    double kakuH = ((360 * H) / 12) + ((30 * M) / 60);
        double kakuM = (360 * M) / 60;
        double kaku = Math.abs(kakuM - kakuH);
        if(kaku > 180){
            kaku = 360 - kaku;
        }

        if(kaku == 0) {
            int tmp = Math.abs(A - B);
            System.out.println(tmp);
        } else if(kaku == 180) {
        	System.out.println(A + B);
        } else {
	        double cos = Math.cos(Math.toRadians(kaku));
	        double ans = (A * A) + (B * B) - (2 * A * B * cos);
	        System.out.println(Math.sqrt(ans));
        }
    }
}
