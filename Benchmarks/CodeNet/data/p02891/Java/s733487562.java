

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		char[] str2 = Arrays.copyOf(str, str.length);
		int k = sc.nextInt();;

		if(str.length == 1){
			System.out.println(k/2);
			return;
		}
		int changeCount = 0;
		int changeCount2 = 1;
		str2[0] = 'A';

		for(int i = 1; i < str.length; i++){
			if(str[i] == str[i - 1]){
				changeCount++;
				str[i] = 'A';
			}
			if(str2[i] == str2[i - 1]){
				changeCount2++;
				str2[i] = 'A';
			}
		}
//		System.out.println(str);
//		System.out.println(str2);

		long result = 0;
		int mode = 0;
		for(int i = 0; i < k; i++){
			if(i == 0){
				mode = 0;
			}
			else {
				if(mode == 0 && str[0] != str[str.length - 1]){
					mode = 0;
				}
				else if(mode == 1 && str[0] != str2[str.length - 1]){
					mode = 0;
				}
				else {
					mode = 1;
				}
			}
			if(mode == 0){
				result += changeCount;
			}
			else {
				result += changeCount2;
			}
		}
		System.out.println(result);
	}

}
