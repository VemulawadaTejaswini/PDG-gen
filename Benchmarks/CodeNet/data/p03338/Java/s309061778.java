import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		String[] sArray = s.split("");
		List<String> array = new LinkedList(Arrays.asList(sArray));
		Collections.sort(array);
		array.remove(0);

		for (String str : array) {
		    System.out.println("あ" + str);
		}

		for (int i = 0; i < array.size()-2; i++){
				if (array.get(i).equals(array.get(i+1))){
					array.remove(i+1);
			}
		}

		// 出力
		System.out.println(array.size() - 1);
	}
}