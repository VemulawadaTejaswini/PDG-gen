import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int t=Integer.parseInt(br.readLine());
		Set<String> set=new HashSet<String>();
		StringTokenizer st;
		while((t--)!=0){
			String s=br.readLine();
			st=new StringTokenizer(s," ");
			//String ch=scan.next();
			if(st.nextToken().charAt(0)=='i'){
				set.add(st.nextToken());
			}else{
				if(set.contains(st.nextToken()))
					pw.println("yes");
				else
					pw.println("no");
			}
		}
		pw.close();
	}


}