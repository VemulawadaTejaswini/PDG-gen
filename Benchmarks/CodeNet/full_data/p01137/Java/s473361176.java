

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// インプットデータ取得
		Scanner sc = new Scanner(System.in);

        while(true) {
        	double m=sc.nextDouble();
        	if(m==0) {break;}
        	double x_double=0;
        	double y_double=0;
        	double z_double=0;

        	int x=0;
        	int y=0;
        	int z=0;
        	int answer=0;

        	//mの三乗根に一番近い整数値をzに入れたい
        	z_double=Math.cbrt(m);
//        	System.out.println(z_double);
        	z =  (int) (z_double/ 10.0 * 10);
//        	System.out.println(z);

        	//mからzを引いた数の二乗根に一番近い整数値をyに入れたい
        	y_double=Math.sqrt(m-Math.pow(z, 3));
//        	System.out.println(y_double);
        	y = (int) (y_double/ 10.0 * 10);
//        	System.out.println(y);

        	x_double=m-(Math.pow(z, 3)+Math.pow(y, 2));
//        	System.out.println(x_double+"xd");
        	x = (int) (x_double/ 10.0 * 10);
//        	System.out.println(x);

        	answer =x+y+z;
        	System.out.println(answer);


        }



	}

    public static int DtoI(double d) {
    	int answer =0;
    	return answer;
    }
}

