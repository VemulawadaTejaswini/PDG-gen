import java.math.BigDecimal;
import java.util.Scanner;

class Main{


    public static void main(String[] a){

    	double aa = 0;
    	double b = 0;
    	double c = 0;
    	double d = 0;
    	double e = 0;
    	double f = 0;


    	double x;
    	double y;

    	Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
        	aa = sc.nextInt();
        	b = sc.nextInt();
        	c = sc.nextInt();
        	d = sc.nextInt();
        	e = sc.nextInt();
        	f = sc.nextInt();

         	x = (c / b - f / e) / (aa / b - d / e);
    		y = (c - aa * x) / b;

    		 BigDecimal xx = new BigDecimal(x);
    		 BigDecimal yy = new BigDecimal(y);

    		 xx = xx.setScale(3, BigDecimal.ROUND_HALF_UP);
    		 yy = yy.setScale(3, BigDecimal.ROUND_HALF_UP);

        	System.out.println(xx + " " + yy);




        }


        sc.close();




   }


}