import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int i,a,b,c;
		try {
			s = r.readLine();
			int number = Integer.parseInt(s);
			for(i=0;i<number;i++){
				s = r.readLine();
				st = new StringTokenizer(s," ");
				a = Integer.parseInt(st.nextToken().toString());
				b = Integer.parseInt(st.nextToken().toString());
				c = Integer.parseInt(st.nextToken().toString());
				if((a*a+b*b==c*c)||(b*b+c*c==a*a)||(c*c+a*a==b*b)){
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		} catch (NoSuchElementException e) {
			System.exit(0);
		}
	}
}