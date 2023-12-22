import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int a,b,x;
		while(true){
			a = n.nextInt();
			b = n.nextInt();
			if(a == 0 && b == 0) break;
			if(b>a){
				x=b;
				b=a;
				a=x;
			}
			System.out.println( b + " " + a );
			
			
		}
	}

}