import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc;
	public void printH(int[] x){
		for(int i = 0; i < x.length - 1; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println(x[x.length-1]);
	}
	public void run(){
		sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double menseki = r * r * Math.PI;
		double enshuu = 2 * r * Math.PI;
		System.out.printf("%f %f", menseki, enshuu);
	}
	public static void main(String[] args){
		new Main().run();
	}
}