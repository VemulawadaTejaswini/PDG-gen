import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();
		
		boolean ac = !S.substring(A-1, C-1).contains("##");
		boolean bd = !S.substring(B-1, D-1).contains("##");
		if(C<D){
			if(ac&&bd){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else{
			boolean bd2 = S.substring(B-2, D).contains("...");
			if(ac&&bd&&bd2){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}