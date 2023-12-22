
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = a;
			int y = b;
			if(x < y){
				int temp = x;
				x = y;
				y = temp;
			}
			//ツ催妥・ツ古カツ姪アツ青板づーツ仰づ淞づゥ
			while(y != 0){
				int temp = x % y;
				x = y;
				y = temp;
			}
			long lcm = (long)a * b / x;
			System.out.println(x + " " + lcm);

		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}