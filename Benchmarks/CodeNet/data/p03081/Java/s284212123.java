import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<q;i++) {
			sb1.append(in.next());
			sb2.append(in.next());
		}
		String t = sb1.toString();
		String d = sb2.toString();
		s = " " + s + " ";
		int l_max = 0;
		int r_max = n+1;
		for(int i=q-1;i>=0;i--) {
			if(d.charAt(i)=='L') {
				if(t.charAt(i)==s.charAt(l_max+1)) l_max++;
			}else {
				if(t.charAt(i)==s.charAt(r_max-1)) r_max--;
			}
		}
		System.out.println(r_max-l_max-1<0?0:r_max-l_max-1);
		in.close();
	}

}
