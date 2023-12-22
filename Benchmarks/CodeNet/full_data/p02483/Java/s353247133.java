import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int tmp = 0;
			if(a>b){
				tmp = a;
				a = b;
				b = tmp;
			}
			if(b>c){
				tmp = b;
				b = c;
				c = tmp;
			}
			if(a>b){
				tmp = a;
				a = b;
				b = tmp;
			}
			System.out.println(a+" "+b+" "+c);
	}
}