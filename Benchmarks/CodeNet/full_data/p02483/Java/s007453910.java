import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int[] n=new int[3];
		while((s=reader.readLine())!=null){
			t=s.split(" ");
			for(int i=0;i<3;i++){
				n[i]=Integer.parseInt(t[i]);
			}
			Arrays.sort(n);
			System.out.println(n[0]+" "+n[1]+" "+n[2]);
		}
	}
}