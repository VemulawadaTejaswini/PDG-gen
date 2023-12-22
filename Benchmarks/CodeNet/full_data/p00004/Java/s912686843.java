import java.math.BigDecimal;
import java.util.Scanner;

class Main{


    public static void main(String[] a){

    	double aa;
    	double b;
    	double c;
    	double d;
    	double e;
    	double f;


    	double x;
    	double y;

    	Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {

        	aa = (double)sc.nextInt();
        	b = (double)sc.nextInt();
        	c = (double)sc.nextInt();
        	d = (double)sc.nextInt();
        	e = (double)sc.nextInt();
        	f = (double)sc.nextInt();

         	x = (c / b - f / e) / (aa / b - d / e);
    		y = (c - aa * x) / b;

    		 BigDecimal xx = new BigDecimal(x);
    		 BigDecimal yy = new BigDecimal(y);

    		 xx = xx.setScale(3, BigDecimal.ROUND_HALF_UP);
    		 yy = yy.setScale(3, BigDecimal.ROUND_HALF_UP);

        	System.out.println(xx + " " + yy);
//        	System.out.printf("%.3f",xx + " " + "%.3f",yy);




        }


        sc.close();


   }


}