import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i < k; i++){
			int d = sc.nextInt();
			for(int j = 0; j < d; j++){
				a.add(sc.nextInt());
			}
		}
		List<Integer> result = new ArrayList<Integer>(new HashSet<>(a));
		System.out.println(n - result.size());


	}
}
