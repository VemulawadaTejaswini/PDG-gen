import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> shoplist= new ArrayList<Integer>();

		for(int i=0;i<N;i++) {
			shoplist.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(shoplist);

		int result = 0;
		for(int i=0;i<K;i++) {
			result = result + shoplist.get(i);
		}

		System.out.println(result);

	}


}