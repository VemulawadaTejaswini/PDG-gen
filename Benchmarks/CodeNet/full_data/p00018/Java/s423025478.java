import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
			String str= sc.nextLine();
			String[] stra = str.split(" ");
			for(int i = 0 ; i < stra.length ; i++){
				list.add(Integer.parseInt(stra[i]));
			}
			Collections.sort(list);
			for(int x = stra.length -1; x >= 0  ; x--){
				System.out.print(list.get(x));
				if (x != stra.length -1) System.out.print(" ");
			}
			System.out.println();
		sc.close();
	}

}