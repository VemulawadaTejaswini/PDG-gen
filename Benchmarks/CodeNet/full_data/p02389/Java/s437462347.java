import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s," ");
		
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		System.out.print(x*y);
		System.out.print(" ");
		System.out.println(2*x+2*y);
		
		
	}

}