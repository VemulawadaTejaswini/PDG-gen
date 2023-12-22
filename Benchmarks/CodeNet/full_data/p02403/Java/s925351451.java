import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(1000);
		int h,w;
		while(s.hasNext()) {
			h = Integer.parseInt(s.next());
			w = Integer.parseInt(s.next());
			if((h|w)==0)
				return;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					sb.append('#');
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}