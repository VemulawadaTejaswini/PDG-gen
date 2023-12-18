import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		List<String> result = new ArrayList<String>();
		for (int i=0;i<N;i++) {
			String s = sc.next();
			if ("AC".equals(s)==true) {
				if (A==0&&C==0) {
					System.out.println("No");
					return ;
				}
				if (A<C) {
					A+=1;
					C-=1;
					result.add("A");
				} else {
					A-=1;
					C+=1;
					result.add("C");
				}
			} else if ("AB".equals(s)==true){
				if (A==0&&B==0) {
					System.out.println("No");
					return ;
				}
				if (A<B) {
					A+=1;
					B-=1;
					result.add("A");
				} else {
					A-=1;
					B+=1;
					result.add("B");
				}
			} else {
				if (B==0&&C==0) {
					System.out.println("No");
					return ;
				}
				if (B<C) {
					B+=1;
					C-=1;
					result.add("B");
				} else {
					B-=1;
					C+=1;
					result.add("C");
				}
			}
		}
		System.out.println("Yes");
		for (int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}
}