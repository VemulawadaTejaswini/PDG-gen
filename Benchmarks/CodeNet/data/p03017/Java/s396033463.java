import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt()-1;
		int b = in.nextInt()-1;
		int c = in.nextInt()-1;
		int d = in.nextInt()-1;
		String s = in.next();
		boolean possible = true;
		if(possible) {
			char tmp = s.charAt(a);
			for(int i=a+1;i<=c-1&&i<n;i++) {
				if(tmp=='#'&&s.charAt(i)=='#') {
					possible = false;
					break;
				}
				tmp = s.charAt(i);
			}
		}
		if(possible) {
			char tmp = s.charAt(b);
			for(int i=b+1;i<=d-1&&i<n;i++) {
				if(tmp=='#'&&s.charAt(i)=='#') {
					possible = false;
					break;
				}
				tmp = s.charAt(i);
			}
		}
		if(possible && d<c) {
			int count = 0;
			int tmp_count = 0;
			for(int i=b-1;i<=d+1&&i<n;i++) {
				if(s.charAt(i)=='.') tmp_count++;
				else {
					count = Math.max(count, tmp_count);
					tmp_count = 0;
				}
			}
			count = Math.max(count, tmp_count);
			if(count<3) possible = false; 
		}
		
		System.out.println(possible?"Yes":"No");
		in.close();
	}

}