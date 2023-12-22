import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double max,min,x;
		x=sc.nextDouble();
		max=x;min=x;
		while(sc.hasNext()){
			x=sc.nextDouble();
			if(max<x){
				max=x;
			}
			if(x<min){
				min=x;
			}
		}//while
		double ans=max-min;
		System.out.println(ans);
	}

}