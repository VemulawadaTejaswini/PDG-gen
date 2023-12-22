import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String[] str=sc.next().split(",");
			double x1=Double.parseDouble(str[0]);
			double y1=Double.parseDouble(str[1]);
			double x2=Double.parseDouble(str[2]);
			double y2=Double.parseDouble(str[3]);
			double xq=Double.parseDouble(str[4]);
			double yq=Double.parseDouble(str[5]);
			double x,y,d,e;
			if(x1==x2){
				y = yq;
				x = 2*x1 - xq;
			}else if(y1==y2){
				x = xq;
				y = 2*y1 - yq;
			}else{
				d = (y2-y1)/(x2-x1);
				e = y1-d*x1;
				x = (2*yq*d-2*d*e+xq-d*d*xq)/(d*d+1);
				y = (xq-x)/d+yq;
			}
			System.out.printf("%.6f %.6f\n",x,y);
		}
	}
}