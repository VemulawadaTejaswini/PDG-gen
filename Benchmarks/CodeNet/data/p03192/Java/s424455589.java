import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = String.valueOf(n);
		char[] ss = s.toCharArray();
		int count = 0;
		for(int i=0; i<ss.length; i++) {
			if(ss[i]=='2') {
				count++;
			}else {
				continue;
			}
		}
		System.out.println(count);
	}
}
