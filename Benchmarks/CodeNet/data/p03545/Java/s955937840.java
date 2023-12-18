
import java.util.Scanner;

public class Main {
	static int cheak(int a,int b,int i) {
		int sum=0;
		if(i==0) {
			if(a==0)sum = b;
			else if(b==0)sum = a;
			else sum = a+b;
		}
		else if(i==1) {
			if(a==0)sum = -b;
			else if(b==0)sum = a;
			else sum = a-b;
		}
		return sum;
	}
	static String print(int c) {
		String s = "";
		if(c==0)return s = "+";
		if(c==1)return s = "-";
		return s;
	}
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.next();
			String[] strArray = str.split("");
			int[] s = new int[4];
			int[][][] sum = new int[2][2][2];
			int flag = 0;
			String w="",q="",r="";
			
			for(int i=0;i<4;i++) {
				s[i] = Integer.parseInt(strArray[i]);
			}
			
			
			for(int i=0;i<2;i++) {
				int sumi = cheak(s[0],s[1],i);
				for(int j=0;j<2;j++) {
					int sumj = cheak(sumi,s[2],j);
					for(int k=0;k<2;k++) {
							sum[i][j][k] = cheak(sumj,s[3],k);
							if(sum[i][j][k] == 7) {
								w = print(i);q = print(j);r = print(k);
								flag = 1;
								break;
							}
					}
					if(flag == 1) break;
				}
				if(flag == 1) break;
			}
			
			System.out.print(s[0]+w+s[1]+q+s[2]+r+s[3]+"=7");
		}
	}
}

