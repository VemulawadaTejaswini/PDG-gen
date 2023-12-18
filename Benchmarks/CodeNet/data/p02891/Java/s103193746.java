package agc039;

import java.util.Scanner;

public class A {
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		String S = sc1.next();

		Scanner sc2 = new Scanner(System.in);
		int K = sc2.nextInt();

		String[] strList = S.split("");
		int[] changeList = new int[strList.length];

		for(int i = 0; i < strList.length - 2; i++){
			if(strList[i].equals(strList[i + 1])){
				strList[i + 1] = "*";
				changeList[i + 1] ++;
			}else{
				if(strList[i + 1].equals(strList[i + 2])){
					strList[i + 2] = "*";
					changeList[i + 2] ++;
				}
			}
		}

		if(strList[0].equals(strList[strList.length - 1])){
			strList[strList.length - 1] = "*";
			changeList[strList.length - 1]++;
		}

		int result = 0;
		for(int count : changeList){
			if(count > 0){
				result++;
			}
		}

		System.out.println(result * K);
	}
}
