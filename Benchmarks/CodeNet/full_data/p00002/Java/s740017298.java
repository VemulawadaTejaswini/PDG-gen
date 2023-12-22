import java.io.*;
import java.util.*;

class Main{
	private static int[] sum_dig(int[][] a){
		int b[] = new int[3];
		int count;
		
		for(int i = 0;i<3;i++){
			count = 1;
			float sum =  a[i][0]+a[i][1];
			while(sum>10.0){
				sum = sum/10;
				count++;
			}
			b[i] = count;
		}
		return b;
	}
	private static void print_dig(int[] a){
		for(int i = 0;i<3;i++){
			System.out.println(a[i]);
		}
	}
		public static void main(String args[]) throws IOException{
			int dig[][] = new int[3][2];
			InputStreamReader inp = new InputStreamReader(System.in);
			BufferedReader bre = new BufferedReader(inp);
			int n1,n2;
			for(int i = 0;i<3;i++){
				String num = bre.readLine();
				String[] numAry = num.split(" ");
				n1 = Integer.parseInt(numAry[0]);
				n2 = Integer.parseInt(numAry[1]);
				dig[i][0] = n1;
				dig[i][1] = n2;
			}
			
			int res[] = new int[3];
			res = sum_dig(dig);
			print_dig(res);
	}
}