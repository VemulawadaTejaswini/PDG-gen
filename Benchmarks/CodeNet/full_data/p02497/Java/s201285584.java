import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int f = sc.nextInt();
		int r = sc.nextInt();
		while(m != -1 || f != -1 || r != -1){
			int mf = m + f;
			if(m == -1 || f == -1){
				System.out.println("F");
			}
			else if(80 <= mf){
				System.out.println("A");
			}
			else if(65 <= mf){
				System.out.println("B");
			}
			else if(50 <= mf){
				System.out.println("C");
			}
			else if(30 <= mf){
				if(50 <= r){
					System.out.println("C");
				}
				else{
					System.out.println("D");
				}
			}
			else{
				System.out.println("F");
			}

			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}