import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double[][] data=new double[65536][3];
		int ptr=0;
		while(sc.hasNext()){
			String[] str=sc.next().split(",");
			if(bmi(Double.parseDouble(str[1]),Double.parseDouble(str[2]))){
				for(int i=0;i<3;i++){
					data[ptr][i]=Double.parseDouble(str[i]);
				}
				ptr++;
			}
		}
		for(int i=0;i<ptr;i++){
			System.out.println((int)data[i][0]);
		}
	}
	static boolean bmi(double w,double h){
		return w/(h*h)>=25?true:false;
	}
}