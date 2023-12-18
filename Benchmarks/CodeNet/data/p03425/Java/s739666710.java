import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		int m = 0;
		int a = 0;
		int r = 0;
		int c = 0;
		int h = 0;
		for(int i=0; i<N; i++){
			s[i] = sc.next();
			char head = s[i].charAt(0);
			if(head=='M')m++;
			else if(head=='A')a++;
			else if(head=='R')r++;
			else if(head=='C')c++;
			else if(head=='H')h++;
		}
		long total = m*a*r + m*a*c + m*a*h + m*r*c + m*r*h + m*c*h + a*r*c + a*r*h + a*c*h + r*c*h;
		System.out.println(total);
	}
}