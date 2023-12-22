import java.util.Scanner;

public class Main {
	public static int LongSC(String a, String b) {
		int[][] data = new int[a.length()+1][b.length()+1];
		for (int i=1;i<a.length()+1;i++) {
			for(int j=1;j<b.length()+1;j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					data[i][j]=data[i-1][j-1]+1;
				}
				else{
					data[i][j]=max(data[i-1][j],data[i][j-1]);
				}
			}
			//for (int z =0;z<a.length();z++) {
			//	System.out.println(Arrays.toString(data[z]));
			//}
			//System.out.println();
		}
		return data[a.length()][b.length()];
	}
	public static int max(int a,int b) {
		if(a>=b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int m=0;m<num;m++) {
			String first = sc.next();
			String second=sc.next();
			System.out.println(LongSC(first,second));
		}
	}
}
