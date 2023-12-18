import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int temp = 0;
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i < n ; i++){
			temp = sc.nextInt();
			list.add(temp);
		}
		for (int t = 0 ; t < list.size() ; t++){
			for (int s = t + 1  ; s < list.size() ;s++){
				sum += list.get(t) * list.get(s);
			}
		}
		System.out.println(sum);
	}
}
