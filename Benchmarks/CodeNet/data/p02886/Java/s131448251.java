
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static public int calc(ArrayList<Integer> arr) {
		int ret = 0;
		for(int i = 1; i < arr.size(); i++) {
			ret = ret + arr.get(0) * arr.get(i);
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList <Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			array.add(sc.nextInt());
		}
		int ans = 0;
		while(true) {
			ans = ans + calc(array);
			array.remove(0);
			if(array.size()==1) {
				break;
			}
		}
		System.out.println(ans);
	}

}

