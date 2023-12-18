import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();
		int count = 0;
		for(int i = 0; i < n; i ++) {
			if(a[i] == b[i]) {
				if(a[i] == c[i]) {

				}else{
					count ++;
				}
			}else{
				if(a[i] == c[i]) {
					count ++;
				}else if(b[i] == c[i]) {
					count ++;
				}else {
					count += 2;
				}
			}
		}
		System.out.println(count);

	}
}