import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		int a,b;
		while(true){
			try {
				a = Integer.parseInt(st.nextToken().toString());
				b = Integer.parseInt(st.nextToken().toString());
				a+=b;
				for(b=0;a!=0;a=a/10) {
					b++;
				}
				System.out.println(b);
				s = r.readLine();
				if (s==null) break;
				st = new StringTokenizer(s," ");
			} catch (NoSuchElementException e) {
				System.exit(0);
			}
		}
	}
}