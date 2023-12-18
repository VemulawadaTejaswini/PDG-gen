import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int h=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a,b;
		double max;
	if((x==0||x==w)&&(y==0||y==h)){
		System.out.println(w*h/2);
		System.out.println(0);
	}else{
		if(w-x>x)
			a=x;
		else
			a=w-x;
		if(h-y>y)
			b=y;
		else
			b=h-y;
		max=w*b>h*a?w*b:h*a;
		System.out.println(max);
		if(w==h&&2*x==w&&2*y==h)
			System.out.println(1);
		else
			System.out.println(0);
	}
	}
		
}