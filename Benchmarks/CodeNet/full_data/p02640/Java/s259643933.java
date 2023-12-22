import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x =Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
		boolean f=false;
		for(int i=0; i<=x; i++) {
			if((i*2+ (x-i)*4)==y) 
			  {f=true; break;}
		}
		System.out.println(f?"Yes":"No");
	}

}