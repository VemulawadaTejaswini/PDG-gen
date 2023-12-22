import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int n,s=0;
		String[] str;
		long[] hen=new long[3];
		n=Integer.parseInt(br.readLine());
		StringBuilder out=new StringBuilder();
		for(int i=0;i<n;i++){
			str=br.readLine().split(" ");
			long max=0;
			for(int j=0;j<3;j++){
				hen[j]=Integer.parseInt(str[j]);
				if(max<hen[j]){	max=hen[j];	s=j;}
			}
			hen[s]=0;
			if(max*max == hen[0]*hen[0]+hen[1]*hen[1]+hen[2]*hen[2]){
				out.append("YES" + "\n");
			}else out.append("NO"+"\n");
		}
		out.delete(out.length()-1,out.length());
		System.out.println(out);
	}
}