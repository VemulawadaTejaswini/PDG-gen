import java.util.Scanner;

/**
 * https://abc045.contest.atcoder.jp/tasks/abc045_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		char[] C = sc.next().toCharArray();
		sc.close();
		
		int ia = 1;
		int ib = 0;
		int ic = 0;
		char current = A[0];
		String ans = null;
		while(ans==null){
			switch(current){
			case 'a':
				if(ia==A.length) ans = "A";
				else current = A[ia++];
				break;
			case 'b':
				if(ib==B.length) ans = "B";
				else current = B[ib++];
				break;
			case 'c':
				if(ic==C.length) ans = "C";
				else current = C[ic++];
				break;
			}
		}
		
		System.out.println(ans);
		
	}

}