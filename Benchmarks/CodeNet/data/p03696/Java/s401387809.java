import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		char []c = sc.next().toCharArray();
		
		int cntr = 0;
		int cntl = 0;
		
		for(int i = 0; i < n ; i++) {
			sb.append(c[i]);
			if(cntr > 0 && c[i] == ')') {
				cntr--;
			}
			if(c[i] =='(') {
				cntr++;
			}
			if(cntr == 0 && c[i] == ')') {
				cntl++;
			}
		}
		for(int i = 0; i < cntl ; i++) {
			sb.insert(0,'(' );
		}
		for(int i = 0; i < cntr; i++) {
			sb.append(')');
		}
		System.out.println(sb.toString());
	}

}
