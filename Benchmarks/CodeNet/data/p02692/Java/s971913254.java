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
		int count[] = new int[3];
		String[] s= new String[N];
		for (int i=0;i<N;i++) {
			s[i] = sc.next();
		}
		for (int i=0;i<N;i++) {
			if ("AB".equals(s[i])==true) {
				count[0]++;
			} else if ("AC".equals(s[i])==true) {
				count[1]++;
			} else {
				count[2]++;
			}
		}
		for (int i=0;i<N;i++) {
			if ("AC".equals(s[i])==true) {
				if (A==0&&C==0) {
					System.out.println("No");
					return ;
				}
				if (A<C) {
					A+=1;
					C-=1;
					result.add("A");
				} else if (C>A){
					A-=1;
					C+=1;
					result.add("C");
				} else {
					if (count[0]%2==1) {
						A+=1;
						C-=1;
						result.add("A");
					} else {
						A-=1;
						C+=1;
						result.add("C");
					}
				}
			} else if ("AB".equals(s[i])==true){
				if (A==0&&B==0) {
					System.out.println("No");
					return ;
				}
				if (A<B) {
					A+=1;
					B-=1;
					result.add("A");
				} else if (B>A){
					A-=1;
					B+=1;
					result.add("B");
				} else {
					if (count[1]%2==1) {
						A+=1;
						B-=1;
						result.add("A");
					} else {
						A-=1;
						B+=1;
						result.add("B");
					}
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
				} else if (C<B){
					B-=1;
					C+=1;
					result.add("C");
				} else {
					if (count[2]%2==1) {
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
		}
		System.out.println("Yes");
		for (int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}
}