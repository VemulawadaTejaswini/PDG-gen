package AtCoder;

import java.util.Scanner;

public class Atcoder {
	public static void main(String[] args){
		int i;
		int [] str = new int [3];
		int [] str2 = new int [3];

		Scanner sc = new Scanner(System.in);

		for(i = 0; i < 3; i++){
			str[i] = sc.nextInt();
			if(str[i] == 1){
				str2[i] = 9;
			} else {
				str2[i] = 1;
			}
		}

		for(i = 0; i < 3; i++){
			System.out.println(str2[i]);
		}

		sc.close();
	}
}
