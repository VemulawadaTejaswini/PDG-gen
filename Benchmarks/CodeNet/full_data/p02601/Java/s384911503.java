//クラス名は必ずMainにする必要があります。

import java.util.*;

public class Main {
  	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[3];
		for(int i = 0; i < 3; i++){
			ary[i] = Integer.parseInt(sc.next());
		}
		int j = 0;
		int num = 0;
		int n = Integer.parseInt(sc.next());
		while(true){
			if(ary[j] >= ary[j+1]){
				ary[j+1] *= 2;
				num++;
			}else{
				j++;
			}
			if(j == 2){
				break;
			}
		}
		if(num <= n){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
}
