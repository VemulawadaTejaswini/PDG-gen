import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double L = sc.nextDouble();
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		int finA = (int)Math.ceil(A/C);
		int finB = (int)Math.ceil(B/D);
		if(finA > finB){
			System.out.println((int)L-finA);
		}else{
			System.out.println((int)L-finB);
		}
	}
}