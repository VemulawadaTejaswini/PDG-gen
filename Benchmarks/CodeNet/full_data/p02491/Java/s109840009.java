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
		ArrayList<Integer> n = new ArrayList<Integer>();

		while(sc.hasNext()){
			int value = sc.nextInt();
			n.add(value);
			n.add(sc.nextInt());
				break;
		}
		int xi = n.get(0);
		int yi = n.get(1);
		float x = (n.get(0)).floatValue();
		float y = n.get(1).floatValue();
		System.out.println(xi / yi + " " + xi % yi + " " + x / y);
	}
	public static void main(String[] args){
		new Main().run();
	}
}