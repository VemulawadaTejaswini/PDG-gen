import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		for(int i=A; i<=B; i++){
			if(isRange(i, A, A+K-1)==true){
				System.out.println(i);
			}else if(isRange(i, B-K+1, B)==true){
				System.out.println(i);
			}
		}
	}

	public static boolean isRange(int x, int from, int to){
		return (x>=from && x<=to);
	}
}
