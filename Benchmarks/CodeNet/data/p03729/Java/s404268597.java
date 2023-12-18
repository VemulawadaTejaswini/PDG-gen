import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private BufferedReader br;
	private int len;
	private StringTokenizer st;
	private String aa,bb,cc;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new Main().start();
	}
	private void start() throws IOException{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=new StringTokenizer(br.readLine());
		aa=st.nextToken();
		bb=st.nextToken();
		cc=st.nextToken();
		if(aa.charAt(aa.length()-1)==bb.charAt(0) && bb.charAt(bb.length()-1)==cc.charAt(0)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
