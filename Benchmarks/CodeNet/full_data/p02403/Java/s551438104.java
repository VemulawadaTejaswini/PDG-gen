
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int H, W, a = 0, cnt = 0;
		ArrayList<Integer> h = new ArrayList<Integer>();
		ArrayList<Integer> w = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while(a < 300){
			H = sc.nextInt();
			W = sc.nextInt();
			if(H == 0 && W == 0)
				break;
			h.add(new Integer(H));
			w.add(new Integer(W));
			a++;
		}
		while(true){
			for(int i = 0; i != h.get(new Integer(cnt)); i++){
				for(int j = 0; j != w.get(new Integer(cnt)); j++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
			if(cnt < a)
				break;
			System.out.print("\n");
			cnt++;
		}
	}
}