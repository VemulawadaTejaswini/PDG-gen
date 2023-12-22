import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String x=stdIn.nextLine();
			char c[]=x.toCharArray();
			if(c[0]=='0')
				break;
			int ans=0;
			for(int i=0;i<x.length();i++)
				ans+=c[i]-'0';
			System.out.println(ans);
		}
	}
}