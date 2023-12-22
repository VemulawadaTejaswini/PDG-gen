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
		int n = Integer.parseInt(sc.next());
		for(int i = 0; i < n; i++){
			if(ary[j] > ary[j+1]){
				ary[j+1] *= 2;
			}else{
				j++;
				i--;
			}
		}
		if(ary[0] < ary[1] && ary[1] < ary[2]){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
}
