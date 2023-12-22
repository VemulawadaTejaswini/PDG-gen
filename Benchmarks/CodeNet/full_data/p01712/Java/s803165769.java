
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArray=br.readLine().split(" ");
		int n=Integer.parseInt(strArray[0]), w=Integer.parseInt(strArray[1])+1, h=Integer.parseInt(strArray[2])+1;
		HashSet<Integer> field=new HashSet<Integer>((int)(w*h/0.75));
		for(int i=0; i<h; i++)
			for(int j=0; j<w; j++)
				field.add(i*w+j);

		for(int k=0; k<n; k++) {
			strArray=br.readLine().split(" ");
			int x=Integer.parseInt(strArray[0]), y=Integer.parseInt(strArray[1]), ww=Integer.parseInt(strArray[2]);
			for(int i=0; i<h; i++) {
				int jBegin, jEnd;
				if(i<=y-ww||i>=y+ww) {
					jBegin=x-ww<0?0:x-ww;
					jEnd=x+ww+1>w?w:x+ww+1;
				} else {
					jBegin=0;
					jEnd=w;
				}
				for(int j=jBegin; j<jEnd; j++) {
					field.remove(i*w+j);
				}
			}
		}

		br.close();

		System.out.println(field.size()==0?"YES":"NO");
	}
}