import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder(1000);
		boolean f = false;

		int h,w;
		while(s.hasNext()) {

			if(f) {
				sb.append("\n");
			}
			f=true;

			h = Integer.parseInt(s.next());
			w = Integer.parseInt(s.next());
			if((h|w)==0)
				break;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					sb.append('#');
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}