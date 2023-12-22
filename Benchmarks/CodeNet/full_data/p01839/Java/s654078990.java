import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String A[]=new String[n];
		for(int i=0;i<n;i++)A[i]=in.next();
		if(n%2==1) {
			System.out.println("NO");
			return;
		}
		Stack<Character> s=new Stack<>();
		boolean j=true;
		for(int i=0;i<n;i++) {
			if(A[i].equals("A"))s.push('A');
			else {
				if(s.isEmpty()) {
					j=false;
					break;
				}
				else s.pop();
			}
		}
		if(j && s.isEmpty())System.out.println("YES");
		else System.out.println("NO");
	}

}

