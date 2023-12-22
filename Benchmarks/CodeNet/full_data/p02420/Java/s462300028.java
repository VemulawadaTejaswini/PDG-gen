import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out=new StringBuilder();
		String str;
		while((str=br.readLine()).equals("-")==false){
			StringBuilder sb=new StringBuilder();
			sb.append(str);
			int n=Integer.parseInt(br.readLine());
			int p;
			for(int i=0;i<n;i++){
				p=Integer.parseInt(br.readLine());
				sb.append(sb.substring(0,p));
				sb.delete(0,p);
			}
			out.append(sb+"\n");
		}
		System.out.println(out);
	}
}