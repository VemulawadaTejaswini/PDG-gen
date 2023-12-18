import java.util.*;
public class Main {
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int N =  sc.nextInt();

        List<Integer>inputList = new ArrayList<Integer>();
        // 入力値分入力を求める	
		for (int i = 0; i < N;i++) {
		
			int num = sc.nextInt();
		
			inputList.add(num);
		}

        // 入力値の重複を削除
         List<Integer> listB = new ArrayList<Integer>(new HashSet<>(inputList));
		
        // 要素数を出力
        System.out.println(listB.size());
	}	


}