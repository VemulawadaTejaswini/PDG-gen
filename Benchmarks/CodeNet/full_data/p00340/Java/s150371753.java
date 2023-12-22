package PCK_Final_16;

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i, j, c = 0;
		int[] array = new int[4];
		for(i = 0;i < 4;++i){
			array[i] = sc.nextInt();
			for(j = 0;j < i;++j){
				if(array[j] == array[i]){
					c++;
					array[j] = -1;
					array[i] = -1;
				}
			}
		}
		System.out.println(c >= 2 ? "yes" : "no");
	}
}