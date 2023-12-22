import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			double temp1 = a * e - d * b;
			double temp2 = c * e - f * b;
			double x = temp2 / temp1;
			double y = ((double)c - x * a) / b;
			if(x == -0.0){
				x = 0.0;
			}
			System.out.printf("%1.3f %1.3f\n", x, y);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}