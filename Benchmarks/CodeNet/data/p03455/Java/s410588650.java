import java.util.*;
import java.io.*;

public class simple_mod {
	public static void main(String []args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=a*b;
		if(c%2==0){
			System.out.print("Even");
		}else{
			System.out.print("Odd");
		}
	}
	
}
