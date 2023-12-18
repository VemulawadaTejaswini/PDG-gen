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
				return o1[1]-o2[1];
			}
		});
		
		int[] orderAry = new int[N+1];
		for (int i = 0; i < M; i++){
			valAry[i][3] = ++orderAry[valAry[i][0]];
		}
		
		Arrays.sort(valAry,new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				return  o1[2]-o2[2];
			}
		});
		
		for(int i = 0; i < M ; i++){
			System.out.println(format(valAry[i][0])+format(valAry[i][3]));
		}
	}
	
	public static String format(int val){
		if(val > 99999) return "" + val;
		else if(val > 9999) return "0" + val;
		else if(val > 999) return "00" + val;
		else if(val > 99) return "000" + val;
		else if(val > 9) return "0000" + val;
		else if(val > 0) return "00000" + val;
		else return "";
	}
}