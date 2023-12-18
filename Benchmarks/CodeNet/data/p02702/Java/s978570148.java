import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int[][] dptable=new int[s.length()][2019];
		int sum=0;
		for(int i=0; i<s.length(); i++) {
			Arrays.fill(dptable[i],0);
		}
		dptable[0][s.charAt(0) - '0']=1;

		for(int i=1; i<s.length(); i++) {
			for(int j=1; j<2019; j++) {
				if(dptable[i-1][j] != 0) {
					if( (j*10 + s.charAt(i) - '0')%2019 != 0) {
						dptable[i][(j*10 + s.charAt(i) - '0')%2019]+=dptable[i-1][j];
					}
					else {
						sum += dptable[i-1][j];
					}
				}
			}
			dptable[i][s.charAt(i) - '0'] += 1;	//新たに開始する連続な部分 2422824228がコーナーに対応するため
		}
		System.out.println(sum);
	}
}