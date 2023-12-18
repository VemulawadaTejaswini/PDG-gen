import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double n=sc.nextDouble();
		
		
		double x=0.0;
		
		double index=0.0;
		int count=1;
		double hoge=Math.floor(x/b);
		
		while(x<=n){
			double tmp=Math.floor((a*x)/b)-a*hoge;
			//System.out.println(tmp);
			
			if(index==0.0)index=tmp;
			else if(index>tmp){
				break;
			}
			else if(index<tmp)index=tmp;
			x++;
		}
		System.out.println((long)index);
		
		

		
	}
	
}
