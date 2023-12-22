import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int n;
		String ans="";
		while((s=r.readLine())!=""){
			t=s.split(" ");
			n=t.length;
			for(int i=0;i<n;i++){
				if(t[i].equals("apple")){t[i]="peach";}
				else if(t[i].equals("peach")){t[i]="apple";}
				else if(t[i].equals("apple.")){t[i]="peach.";}
				else if(t[i].equals("peach.")){t[i]="apple.";}
				ans+=t[i];
				ans+=" ";
			}
			System.out.println(ans);
			ans="";
		}
	}
}