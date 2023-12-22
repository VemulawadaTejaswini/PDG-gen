import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			
			f -= c;
			if(f<0){
				f += 60;
				e--;
			}
			e -= b;
			if(e<0){
				e += 60;
				d--;
			}
			d -= a;
			System.out.println(d + " " + e + " " + f);
		}
	
	}	
}