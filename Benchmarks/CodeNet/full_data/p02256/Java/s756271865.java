import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,j,k,x,y,d,ax,ay,G=0,a=0,b=0,yy;
		Scanner sc=new Scanner(System.in);
		x=Integer.parseInt(sc.next());
		y=Integer.parseInt(sc.next());
		
		if(x<y){
		
		a=x;
		b=y;
		x=b;
		y=a;
		}
		while(y>0){
		a=y;
		b=x%y;
	
		y=b;
		x=a;
		
		}
		
		
		System.out.println(x);
	}

}