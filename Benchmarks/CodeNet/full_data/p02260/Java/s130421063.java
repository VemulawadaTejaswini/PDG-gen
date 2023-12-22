/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// 標準入力の読み込み開始
        Scanner scanner = new Scanner(System.in);

        // 数列の長さ
        int n = scanner.nextInt();

        // 数列
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numList.add(scanner.nextInt());
        }

        // 標準入力の読み込み終了
        scanner.close();
        
        int minj = 0;
        int cnt = 0;
		for (int i = 0; i < n; i++) {
			minj = i;
			
			for (int j = i; j < n; j++) {
				if (numList.get(j) < numList.get(minj)) {
					minj = j;
				}
			}
			//A[i] と A[minj] を交換
			if (i < minj) {
				Collections.swap(numList, i, minj);
				cnt++;
			}
		}
		
		// 出力
		for(int i = 0; i < n; i++){
			System.out.print(numList.get(i));
			if(i < n - 1){
	    		System.out.print(" ");
			}
        }
        System.out.println();
        
        System.out.println(cnt);
    }
}
