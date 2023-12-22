import java.util.*;
class H17_01{
	Scanner sc=new Scanner(System.in);
	int x,h;
	
	void a(){
		while(true){
			x=sc.nextInt();
			h=sc.nextInt();
			if(x==0 && h==0)break;
			
			double S=(double)x*Math.sqrt(4*h*h+x*x)+x*x; 
			
			System.out.println(S);
		}
	}
	public static void main(String[]agrs){
		new H17_01().a();
	}
}