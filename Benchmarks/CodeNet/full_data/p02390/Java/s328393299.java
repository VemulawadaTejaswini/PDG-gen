import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h=0,m=0,s=0;
		while(S!=0) {
			s++;
			if(s==60) {
				s=0;
				m++;
				if(m==60) {
					m=0;
					h++;
				}
			}
			S--;
		}
		System.out.println(h+":"+m+":"+s);
	}
}

