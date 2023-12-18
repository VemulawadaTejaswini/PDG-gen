import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(in.readLine());
		ArrayList<Long> d = new ArrayList<Long>();
		long l;
		int x;
		boolean f;
		for(int i = 0; i < n; i++) {
			l = Long.valueOf(in.readLine());
			if(d.size() != 0) {
				x=0;
				f=false;
				for(long e:d) {
					if(e-l==0) {
						d.remove(x);
						f=true;
						break;
					}
					x++;
				}
				if(!f) {
					d.add(l);
				}
			}else {
				d.add(l);
			}
		}
		System.out.print(d.size());
	}
}