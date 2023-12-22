import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		String h = in.next();
		String m = in.next();

		BigDecimal a2 = new BigDecimal(a);
		BigDecimal b2 = new BigDecimal(b);
		BigDecimal hour = new BigDecimal(h);
		BigDecimal minute = new BigDecimal(m);

		BigDecimal x = new BigDecimal(360);
		BigDecimal y = new BigDecimal(60);
		BigDecimal z = new BigDecimal(12);
		BigDecimal v = new BigDecimal(180);

		BigDecimal long_needle = minute.multiply(x.divide(y));
		BigDecimal short_needle = (((hour.multiply(y)).add(minute))).multiply(x).divide(z.multiply(y));

		BigDecimal dif = BigDecimal.ZERO;
		BigDecimal rad = BigDecimal.ZERO;
		BigDecimal result = BigDecimal.ZERO;

		if((long_needle.compareTo(short_needle)) > 0) {
			/*if(l - s <= 90) {
				dif = l - s;
			}else if(l - s <= 180){
				dif = 90 - (l - s);
			}else if(l - s < 270){
				dif = 180 - (l - s);
			}else {
				dif = 360 - (l - s);
			}
			*/
			dif = long_needle.subtract(short_needle);
		}else {
			/*
			if(s - l <= 90) {
				dif = s - l;
			}else if(s - l <= 180){
				dif = 90 - (s - l);
			}else if(s - l < 270){
				dif = 180 - (s - l);
			}else {
				dif = 360 - (s - l);
			}
			*/
			dif = short_needle.subtract(long_needle);
		}
		BigDecimal p = new BigDecimal(Math.PI);
		rad = dif.multiply(p.multiply(v));

		String rad_kari = rad.toString();
		double r = Double.parseDouble(rad_kari);
		double cos = Math.cos(r);
		rad = new BigDecimal(cos);
		v = new BigDecimal(2);

		result = (a2.pow(2)).add(b2.pow(2)).subtract(v.multiply(a2.multiply(b2)).multiply(rad));
		result = sqrt(result,50);

		/*
		System.out.println(l);
		System.out.println(s);
		System.out.println(dif);
		*/
		System.out.println(String.format("%.20f", result));
	}

	public static BigDecimal sqrt(BigDecimal a, int scale){

        BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17){
             x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
             return x;
        }

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }

}
