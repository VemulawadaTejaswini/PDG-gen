import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		sc = new Scanner(System.in);

		List<Integer> zenbu=new ArrayList<>();
		List<Integer> motomeru=new ArrayList<>();
		for(int i=0; i<a; i++){
			zenbu.add(sc.nextInt());
		}
		motomeru=zenbu;
		for(int i=0; i<a; i++){
			motomeru=zenbu;
			int moro=motomeru.get(i);
			motomeru.remove(i);
			Collections.sort(motomeru);
			int res=motomeru.get(a/2);
			System.out.println(res);
			motomeru=zenbu;
			motomeru.add(moro);
		}
	}
}