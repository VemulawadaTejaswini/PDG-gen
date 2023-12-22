import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String t = "";
		boolean[] c = new boolean[3];
		for(int i = 0;i<3;i++)c[i]=false;c[2]=true;
		while ((t = bf.readLine()) != null) {
			String[] s = t.split(",");
			if(s.length!=2)break;
			int p0 = (int)s[0].charAt(0)-'A';
			int p1 = (int)s[1].charAt(0)-'A';
			if(c[p0]||c[p1]){
				boolean x=c[p0];c[p0]=c[p1];c[p1]=x;
			}
		}
		for(int i = 0;i<3;i++)if(c[i]){
			System.out.println((char)('A'+i));
			break;
		}
	}
}