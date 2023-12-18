import java.util.Scanner;

public class Main {
	static char[] letter= new char[]{'a','b','c','d','e','f','g','h','i','j'};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		byte a[] = new byte [N];
		for (int i =0;i<N;i++) {
			a[i]='a';
		}
		String s = new String(a);
		Main main = new Main();
		main.printResult(a,0,a.length,1) ;
	}
	public void printResult(byte[] s,int vocation,int length,int count) {
		if (length-1== vocation) {
			System.out.println(new String(s));
			return ;
		} else {
			printResult(s,vocation +1,length,count) ;
			for (int i=1;i<=count;i++) {
				String str = new String(s);
				byte b[] = str.getBytes();
				b[vocation+1]= (byte)letter[i];
				if (i>b[vocation]-'a') {
					printResult(b,vocation +1,length,count+1) ;
				} else {
					printResult(b,vocation +1,length,count) ;
				}
			}
		}
	}
}