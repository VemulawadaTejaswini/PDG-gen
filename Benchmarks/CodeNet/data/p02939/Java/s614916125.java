import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		String str = sc.next();
		String[] strArray = str.split("");
		int strLength = str.length();

		List<Integer> list = new ArrayList<>();
		int count = 1;
		String prevS = strArray[0];
		for (int i = 1; i < strLength; i++) {
			String s = strArray[i];
			if(prevS.equals(s)){
				count++;
			}else{
				list.add(count);
				count = 1;
				prevS = s;
			}
		}
		list.add(count);

		int result = 0;
		int size = list.size();

		for (int i = 0; i <size; i++) {
			int num = list.get(i);
			if(num ==1){
				result++;
			}else if (num%3 == 0){
				result += (num/3) * 2;
			}else if (num%3 == 1){
				result += ((num+1)/3) * 2 -1 ;
			}else if (num%3 == 2){
				result += ((num+2)/3) * 2 -1 ;
			}
		}
		// System.out.println(result);
		// System.out.println(list);


		
		for (int i = 0; i < size - 1; i++) {
			int num = list.get(i);
			if(num % 3 == 2){
				int nextNum = list.get(i+1);
				if(nextNum % 3 == 2){
					// System.out.println(i);

					result++;
					i++;
				}
			}
		}

		System.out.println(result);
	}
}
