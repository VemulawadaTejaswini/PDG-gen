
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		String[][] list = new String[9][9];
		for(int i=1; i <= 8; i++){
			String str = sc.next();
			for(int j=1; j <= 8; j++){
				list[i][j] = "" + str.charAt(j-1);
			}
		}

		//90
		System.out.println(90);
		for(int i=1; i <= 8; i++){
			for(int j=8; j >= 1; j--){
				System.out.print(list[j][i]);
			}
			System.out.println("");
		}

		//180
		System.out.println(180);
		for(int i=8; i >= 1; i--){
			for(int j=8; j >= 1; j--){
				System.out.print(list[i][j]);
			}
			System.out.println("");
		}

		//270
		System.out.println(270);
		for(int i=8; i >= 1; i--){
			for(int j=1; j <= 8; j++){
				System.out.print(list[j][i]);
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}