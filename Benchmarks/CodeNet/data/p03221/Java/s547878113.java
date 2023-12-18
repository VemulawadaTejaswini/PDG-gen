import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] valAry = new int[M][4];//区域  年份  case顺序  排序顺序
		
		for(int i = 0; i < M ; i++){
			int P = sc.nextInt();
			int Y = sc.nextInt();
			valAry[i][0] = P;
			valAry[i][1] = Y;
			valAry[i][2] = i;
		}
		
		Arrays.sort(valAry,new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				if(o1[0]-o2[0] == 0) return o1[1]-o2[1];
				else return o1[0]-o2[0];
			}
		});
		
		for (int i = 0; i < valAry.length - 1; i++){
			int j = i + 1;
			if (valAry[i][0] == valAry[j][0]) valAry[j][3] = valAry[j][3] + 1;
		}
		
		Arrays.sort(valAry,new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				return  o1[2]-o2[2];
			}
		});
		
		for(int i = 0; i < M ; i++){
			System.out.println(String.format("%06d", valAry[i][0])+String.format("%06d", valAry[i][3] + 1));
		}
	}
}