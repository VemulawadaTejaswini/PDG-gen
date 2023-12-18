import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long  a = sc.nextInt();
		long  b = sc.nextInt();
		int c=0;
		for(;;) {
			a--;
			if(a<0) {
				a++;
				break;
			}
			b-=2;
			if(b<0) {
				b+=2;
				break;
			}
			c++;
		}
		for(;;) {
			b-=4;
			if(b<0) {
				b+=4;
				break;
			}
			c++;
		}
		System.out.println(c);
	}
}