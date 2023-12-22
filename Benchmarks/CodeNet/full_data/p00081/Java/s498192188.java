import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#0.000000");
		while(sc.hasNext()){
			String[] str=sc.next().split(",");
			double x1=Double.parseDouble(str[0]),
					y1=Double.parseDouble(str[1]),
					x2=Double.parseDouble(str[2]),
					y2=Double.parseDouble(str[3]),
					xq=Double.parseDouble(str[4]),
					yq=Double.parseDouble(str[5]);
			double x,y,d,e;
			if(x1 == x2){
				y = yq; x = 2*x1 - xq;
			}
			else if(y1 == y2){
				x = xq;
				y = 2*y1 - yq;
			}else{
				d = (y2 - y1)/(x2 - x1);
				e = y1 - d*x1;
				x = (2*yq*d - 2*d*e + xq - d*d*xq)/(d*d + 1);
				y = (xq - x)/d + yq;
			}
			 System.out.println(format.format(x) + " " + format.format(y));
		}
	}
}