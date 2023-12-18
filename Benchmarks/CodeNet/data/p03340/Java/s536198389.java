import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> num = new ArrayList<Integer>();
		for(int i=0; i<N; i++){
			num.add(sc.nextInt());
		}

		//int[] num = Num.toArray(new int[Num.size()]);

		int[][] xor = new int[N][N];
		int[][] sum = new int[N][N];
		int count = 0;
		for(int i=0; i<N; i++){
			xor[i][i] = num.get(i);
			sum[i][i] = num.get(i);
			count ++;
			for(int j=i+1; j<N; j++){
				sum[i][j] = sum[i][j-1] + num.get(j);
				xor[i][j] = xor[i][j-1]^num.get(j);
				if(sum[i][j] == xor[i][j]){
					count ++;
				}
			}

		}
		System.out.println(count);
	}
}
