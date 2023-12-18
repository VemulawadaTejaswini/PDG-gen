import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char [] a = sc.next().toCharArray();
		int b = 0;
		int c = 0;
		
		for(int i = 0; i < a.length; i+=2) {
			if(a[i]=='R' || a[i]=='U' || a[i]=='D') {//奇数の条件
				b++;
			}else {
				b=0;
				break;
			}
		}
		
		for(int j = 1; j < a.length; j+=2) {
			if(a[j]=='L' || a[j]=='U' || a[j]=='D') {//偶数の条件
				c++;
			}else {
				c=0;
				break;
			}
		}

		if(b==0 || c == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}




	}

}
