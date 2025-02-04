import java.io.*;
import java.util.*;

class Main{
	private static int[] sum_dig(int[][] a){
		int b[] = new int[100];
		int count;
		
		for(int i = 0;i<a.length;i++){
			count = 1;
			if((a[i][0] == 0) && (a[i][1] == 0))break;
			float sum =  a[i][0]+a[i][1];
			while(sum>=10.0){
				sum = sum/10;
				count++;
			}
			b[i] = count;
		}
		return b;
	}
	private static void print_dig(int[] a){
		for(int i = 0;i<a.length;i++){
			if(a[i] == 0)break;
			System.out.println(a[i]);
		}
	}
		public static void main(String args[]) throws IOException{
			int dig[][] = new int[100][2];
			InputStreamReader inp = new InputStreamReader(System.in);
			BufferedReader bre = new BufferedReader(inp);
			int n1,n2,i = 0;
			while(bre.ready()!=true){
				try{String num = bre.readLine();
				String[] numAry = num.split(" ");
				n1 = Integer.parseInt(numAry[0]);
				n2 = Integer.parseInt(numAry[1]);
				dig[i][0] = n1;
				dig[i][1] = n2;
				i ++;
			}
			catch(NumberFormatException e){
				break;
			}
			}
			
			int res[] = new int[3];
			res = sum_dig(dig);
			print_dig(res);
	}
}