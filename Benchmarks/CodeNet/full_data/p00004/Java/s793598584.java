import java.util.Scanner;
import java.math.BigDecimal;
class Main{
	static Scanner sc;
	static double a[];
	static String x,y;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		while(true){
			a=new double[6];
			for(int i=0;i<6;i++){
				if(sc.hasNext())a[i]=sc.nextDouble();
			}
				x=Long.toString(Math.round(1000*(a[2]*a[4]-a[1]*a[5])/(a[0]*a[4]-a[1]*a[3])));
				y=Long.toString(Math.round(1000*(a[3]*a[2]-a[0]*a[5])/(a[3]*a[1]-a[0]*a[4])));
				if(x.substring(0,1).equals("-")){
					x=x.substring(1,x.length());
					while(x.length()<4){
						x="0"+x;
					}
					x="-"+x;
				}else{
					while(x.length()<4){
						x="0"+x;
					}
				}
				if(y.substring(0,1).equals("-")){
					y=y.substring(1,y.length());
					while(y.length()<4){
						y="0"+y;
					}
					y="-"+y;
				}else{
					while(y.length()<4){
						y="0"+y;
					}
				
				}
			System.out.println(x.substring(0,x.length()-3)+"."+ x.substring(x.length()-3,x.length()) +" "+y.substring(0,y.length()-3)+"."+ y.substring(y.length()-3,y.length()));
		}
	}
} 