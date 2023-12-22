import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String W = in.nextLine();
		W = W.toLowerCase();
		int ans = 0;
		while(in.hasNext()) {
			String s = in.nextLine();
			if(s.equals("END_OF_TEXT")) break;
			s = s.toLowerCase();
			String sp[] = s.split(" ");
			for(int i=0;i<sp.length;i++) {
				if(sp[i].equals(W)) ans++;
			}
		}
		System.out.println(ans);
	}
}