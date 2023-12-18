import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();

		int count=0;
		for(int i=0;i<N;i++) {
			char a = A.charAt(i);
			char b = B.charAt(i);
			char c = C.charAt(i);
			if(a==b && a==c) {
				//nothing
			}else if(a==b || b ==c || a==c) {
				count++;
			}else {
				count++;
				count++;
			}
		}
		System.out.println(count);
	
	
	}
}
