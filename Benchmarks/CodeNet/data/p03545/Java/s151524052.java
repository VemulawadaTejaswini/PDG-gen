
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int cheak(int a,int b,int i) {
		int sum=0;
		if(i==0) sum = a+b;
		if(i==1) sum = a-b;
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
			int[][][] sum = new int[1][1][1];
			int flag = 0;
			String w="",q="",r="";
			
			for(int i=0;i<4;i++) {
				s[i] = Integer.parseInt(strArray[i]);
			}
			
			Arrays.sort(s);
			
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					for(int k=0;k<2;k++) {
							sum[i][j][k] = cheak(cheak(cheak(s[0],s[1],i),s[2],j),s[3],k);
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

