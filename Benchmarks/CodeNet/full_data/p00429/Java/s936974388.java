import java.io.*;
public class Main {
	public static void main(String args[])throws IOException{
		int n,count;
		String str,ans;
		char prev;
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		do{
			n=Integer.parseInt(br.readLine());
			if(n==0) break;
			str=br.readLine();
			for(int i=0;i<n;i++){
				ans="";
				prev='a';
				count=1;
				int slen=str.length();
				for(int j=0;j<slen;){
					int k;
					prev=str.charAt(j);
					for(k=j+1,count=1;k<slen&&str.charAt(k)==prev;k++,count++)
						;
					ans+=count+""+str.charAt(j);
					j=k;
				}
				str=ans;
			}
			System.out.println(str);
		}while(true);
	}
}