import java.text.DecimalFormat;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		while(input.hasNext()){
			String str=input.nextLine();
			String[] num=str.split(" +");
			int a=0,b=0,c=0,d=0,e=0,f=0;
			int x,y;
			int absA=Math.abs(Integer.parseInt(num[0]));
			int absD=Math.abs(Integer.parseInt(num[3]));
			for(int i=0;i<num.length;i++){
				a=Integer.parseInt(num[0])*absD;
				b=Integer.parseInt(num[1])*absD;
				c=Integer.parseInt(num[2])*absD;
				d=Integer.parseInt(num[3])*absA;
				e=Integer.parseInt(num[4])*absA;
				f=Integer.parseInt(num[5])*absA;
			}
			//a,d??????
			if(a*d>=0){
				y=(c-f)/(b-e);
				x=(c-b*y)/a;
			}
			else{
				y=(c+f)/(b+e);
				x=(c-b*y)/a;
			}
			
			System.out.print(df.format(x)+" "+df.format(y));
			System.out.println();
			
			
		}
	}

}