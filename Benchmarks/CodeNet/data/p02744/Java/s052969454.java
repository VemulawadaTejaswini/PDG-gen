import java.util.Scanner;

public class Main {
	static char[] letter= new char[]{'a','b','c','d','e','f','g','h','i','j'};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		char a[] = new char [N];
		for (int i =0;i<N;i++) {
			a[i]='a';
		}
		String s = new String(a);
		Main main = new Main();
		main.printResult(a,0,a.length,1) ;
	}
	public void printResult(char[] s,int vocation,int length,int count) {
		if (length-1 == vocation) {
			System.out.println(s);
			return ;
		} else {
			System.out.println(s);
			for (int i =length-vocation-1;i>0;i--) {
				s[i+vocation]=letter[count];
				printResult(s,vocation+i,length,count+1) ;
			}

		}

	}
}