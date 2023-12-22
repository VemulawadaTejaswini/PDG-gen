import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double A = s.nextDouble();// 時針の長さ
        double B = s.nextDouble(); //分針の長さ
        double H = s.nextDouble();
        double M = s.nextDouble();
        

        double radb = Math.toRadians((M*360)/60);
        double rada = Math.toRadians((360*H/12)+(360*M/720));

 /*       System.out.println((M*360)/60+" "+((360*H/12)+(360*M/720))); //孤度法
        System.out.println(radb+" "+rada); //ラジアン */

        double ans =
        		Math.sqrt(A*A + B*B - 2*A*B*Math.cos(rada-radb));

        System.out.println(ans);
      



	}

}
