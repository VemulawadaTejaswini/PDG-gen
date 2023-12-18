import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long A=0, B=0, C=0, D=0;
		for(int i=0;i<T;i++){
			Set<Long> se = new HashSet<Long>();
			A = sc.nextLong();
			B = sc.nextLong();
			C = sc.nextLong();
			D = sc.nextLong();
			while(true){
				if(A > B) A = A%B;
				else A -= B;
				if(A<0){
					System.out.println("No");
					break;
				}
				if(A<=C){
					if(se.contains(A)){
						System.out.println("Yes");
						break;
					}
					se.add(A);
					A += D;
				}
			}
		}
	}
}