import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import java.io.*;

public class ASA_A {
	public static void main(String[] args) {
		try {
			run();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	private static void run() throws IOException{
		int n;
		int input;
		String inst;
		String[] str;
		Pattern p = Pattern.compile("[:,.]+");
		
		HashSet<String> member = new HashSet<String>();
		HashSet<String> group = new HashSet<String>();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			member.clear();
			group.clear();
			n = Integer.parseInt(in.readLine()); //???????????£?????????
			if(n==0) break;
			
			for(int i=0;i<n;i++) {
				inst = in.readLine();
				str = p.split(inst,-1);
				group.add(str[0]);
				for(int j=1;j<str.length-1;j++) {
					member.add(str[j]);
				}
			}
			member.removeAll(group);
			System.out.println(""+member.size());
		}
	}
}