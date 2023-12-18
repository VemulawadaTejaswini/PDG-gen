import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char[][] str = new char[a][10];
		for(int i=0;i<a;i++) {
			String b = sc.next();
			for(int j=0;j<10;j++) {
				str[i][j] = b.charAt(j);
			}
			Arrays.sort(str[i]);
			
		}
		int samecnt = 0;
		for(int i=0;i<a;i++) {
			String s1 = String.valueOf(str[i]);
			for(int j=i+1;j<a;j++) {
				String s2 = String.valueOf(str[j]);
				if(s1.equals(s2)) {
					samecnt++;
				}
			}
		}
		System.out.println(samecnt);
		sc.close();

	}

}
