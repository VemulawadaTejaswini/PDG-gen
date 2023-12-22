import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double v=sc.nextDouble();
			double t=v/9.8;
			double y=4.9*t*t;
			double n=0;
			while(true){
				if ((5*n-5)>y) {
					System.out.println((int)n);
					break;
				}
				n++;
			}
		}
	}
}