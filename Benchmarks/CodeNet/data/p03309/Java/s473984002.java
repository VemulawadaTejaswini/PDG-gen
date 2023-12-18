import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		for(int i=1;i<=N;i++) {
			int j = sc.nextInt();
			A.add(j);
		}
		int min = Integer.MAX_VALUE ;
		for(int i = 0 ; i < A.size() ; i++) {
			int b = A.get(i)-(i+1);
			if(abs(A,b)<min) {
				min = abs(A,b);
			}
		}
		System.out.println(min);
	}
	public static int abs(List<Integer> A,int b) {
		int abs = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			abs += Math.abs(A.get(i)-(b+i+1));
		}
		return abs;
	}

}
