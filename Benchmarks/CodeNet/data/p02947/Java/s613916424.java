import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char[][] str = new char[a][10];
		String[] s = new String[a];
		for(int i=0;i<a;i++) {
			String b = sc.next();
			for(int j=0;j<10;j++) {
				str[i][j] = b.charAt(j);
			}
			Arrays.sort(str[i]);
			s[i] = String.valueOf(str[i]);
			//System.out.println(str[i]);
		}
		Arrays.sort(s);
		
		int samecnt = 0;
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				if(s[i].equals(s[j])) {
					samecnt++;
				}else {
					break;
				}
			}
		}
		System.out.println(samecnt);
		sc.close();

	}

}
