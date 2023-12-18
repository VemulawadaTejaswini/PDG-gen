import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int val = n % 2 == 1 ? n - 1 / 2 : n / 2 ; 
		int ans = 0;
//		int a = 0;
//		int b = 0;
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> listb= new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			if(i + 1  <= val && tmp <= val) lista.add(tmp);
			if(i + 1 >= n - val && tmp <= n - val - n % 2)listb.add(tmp);
//			if(i + 1  <= val && tmp > val) c++;
//			if(i + 1 >= n - val && tmp >= n - val - n % 2)d++;
		}
		Collections.sort(lista);
		Collections.sort(listb);
		for(int r = 0; r < Math.min(lista.size(), listb.size()); r++) {
			if(lista.get(r) < listb.get(r)) ans++;
		}
		System.out.println(n - 1 - ans);
	}

}