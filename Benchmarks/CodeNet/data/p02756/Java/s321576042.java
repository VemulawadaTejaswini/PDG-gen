import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {



	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    String[] buf = br.readLine().split(" ");
        StringBuffer str = new StringBuffer(buf[0]);
        buf = br.readLine().split(" ");
	    int q = Integer.parseInt(buf[0]);
		int flip = 0;
		for(int i = 0 ; i < q ; i++) {
			buf = br.readLine().split(" ");
			int t = Integer.parseInt(buf[0]);
			if(t == 1) {
				flip = flip ^ t;
			}else{
				int t2 = Integer.parseInt(buf[1]);
				int index = 0;
				if(t2 == 1) {
					index = 0;
				}else {
					index = 1;
				}

				if(flip == 1) {
					if(index == 0) {
						index = 1;
					}else {
						index = 0;
					}

				}

				if(index == 0) {
					str.insert(0, buf[2]);
				}else {
					str.append(buf[2]);
				}


			}


		}
		PrintWriter out = new PrintWriter(System.out);

		if(flip == 1){
	         out.println(str.reverse());
		}else {
			 out.println(str);
		}
		out.flush();
	}
}