import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0,maxx=0;
		char I = 'I';
		char D = 'D';
		int a = sc.nextInt();
		String s = sc.next();
		char sa[] = s.toCharArray();
		for(int i=0;i<a;i++) {
			if(sa[i]==I) {
				x++;
			}
			else if(sa[i]==D) {
				x--;
			}
			if(x>maxx) {
				maxx = x;
			}
		}
		System.out.print(maxx);
		sc.close();
	}

}
