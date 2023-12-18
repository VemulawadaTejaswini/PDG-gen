import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		
		String D,E,F;
		int j=0;
		
		for(int i = 1; i <= 9; i++) {
			D = A.substring(i - 1,1);
			E = B.substring(i - 1,1);
			F = C.substring(i - 1,1);
			if(D == E) {
				if(D == F) {
				}else{
					j++;
				}
			}else {
				j++;
				if(D == F) {
				}else{
					j++;
				}
			}
			
		}
		System.out.println(j);
	}
}