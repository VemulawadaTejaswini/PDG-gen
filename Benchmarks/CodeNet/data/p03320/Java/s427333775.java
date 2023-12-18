import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();

		for(int i=1;i<=9;++i){
			System.out.println(i);
			K--;
			if(K<=0)break;
		}
		int keta = 2;
		while(K>0){
			long[] kouho = new long[9];
			int[] s = new int[9];
			boolean[] valid = new boolean[9];
			for(int i=0;i<9;++i){
				kouho[i] = (i+2)*(long)(Math.pow(10.0,(double)(keta-1)))-1;
				s[i] = i+1+9*(keta-1);
				valid[i] = true;
			}
			double snuke = Double.MAX_VALUE;
			for(int i=8;i>=0;--i){
				double hikaku = (double)kouho[i] / (double)s[i];
				if(hikaku<=snuke) snuke = hikaku;
				else valid[i] = false;
			}
			for(int i=0;i<9;++i){
				if(valid[i]){
					System.out.println(kouho[i]);
					K--;
				}
				if(K<=0) break;
			}
		}
		return;
	}
}