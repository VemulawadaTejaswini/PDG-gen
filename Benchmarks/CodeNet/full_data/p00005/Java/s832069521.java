import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=reader.readLine())!=null){
			String[] t=s.split(" ");
			int[] in=new int[2];
			for(int i=0;i<2;i++)
				in[i]=Integer.parseInt(t[i]);
			int a=in[0];
			int b=in[1];
			if(a<b){int tmp=a;a=b;b=tmp;}
			while(b!=0){
				int tmp=a%b;a=b;b=tmp;
			}
			System.out.println(a+" "+(long)in[0]*in[1]/a);
		}
	}
}