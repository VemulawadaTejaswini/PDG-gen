import java.text.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int n = in.nextInt();
		int k = 0;
		while(k < n){
			list.add(in.next());
			k++;
		}
		k--;
		while(true){
			System.out.print(list.get(k));
			if(k == 0) break;
			System.out.print(" ");
			k--;
		}
		System.out.println();

	}
}