import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] s=new String[10];
		int[] n=new int[10];
		try{
				for(int i=0;i<10;i++){
					s[i]=reader.readLine();
					n[i]=Integer.parseInt(s[i]);
				}
				Arrays.sort(n);
				System.out.println("");
				System.out.println(n[9]);
				System.out.println(n[8]);
				System.out.println(n[7]);
		}catch(IOException e){
			System.exit(0);
		}
	}
}