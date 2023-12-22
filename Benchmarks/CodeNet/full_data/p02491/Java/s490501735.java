import java.util.ArrayList;
import java.util.Scanner;

class Main{
	Scanner sc;
	public void printH(int[] x){
		for(int i = 0; i < x.length - 1; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println(x[x.length-1]);
	}
	public void run(){
		sc = new Scanner(System.in);
		
		int xi = sc.nextInt();
		int yi = sc.nextInt();
		double f = (float) xi/yi;
		System.out.println(xi / yi + " " + xi % yi + " " + f);
	}
	public static void main(String[] args){
		new Main().run();
	}
}