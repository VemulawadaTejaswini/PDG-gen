
import java.util.Scanner;

public class Main {

	private void doIt() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double v = sc.nextDouble();
			double t = v / 9.8;
			double y = 4.9 * t * t;
			for(int n = 2; ;n++){
				int floor = n * 5 - 5;
				if(y <= floor){
					System.out.println(n);
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}