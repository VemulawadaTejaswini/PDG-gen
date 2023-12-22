import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	Scanner sc;
	public void printH(int[] x){
		for(int i = 0; i < x.length - 1; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println(x[x.length-1]);
	}
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		int xi = sc.nextInt();
		int yi = sc.nextInt();
		double x = ((Integer)xi).doubleValue();
		double y = ((Integer)yi).doubleValue();
		if(yi != 0)
		System.out.println(xi / yi + " " + xi % yi + " " + x / y);
		else{
			System.out.println("ゼロ除算");
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}