
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			double lf=48.0,fl,b,f,li,lw,w,lm,m,lh,x;
			fl=lf+3;//51
			b=fl+3;
			f=b+3;
			li=f+3;
			lw=li+4;
			w=lw+5;
			lm=w+6;
			m=lm+6;
			lh=m+10;
			while(sc.hasNext()){
				x=sc.nextDouble();
				if(x<=fl){
					System.out.println("light fly");
				}
				else if(x<=b){
					System.out.println("fly");
				}
				else if(x<=f){
					System.out.println("bantam");
				}
				else if(x<=li){
					System.out.println("light");
				}
				else if(x<=lw){
					System.out.println("light welter");
				}
				else if(x<=w){
					System.out.println("welter");
				}
				else if(x<=lm){
					System.out.println("light middle");
				}
				else if(x<=m){
					System.out.println("middle");
				}
				else if(x<=lh){
					System.out.println("light heavy");
				}
				else{
					System.out.println("heavy");
				}
			}
	}

}