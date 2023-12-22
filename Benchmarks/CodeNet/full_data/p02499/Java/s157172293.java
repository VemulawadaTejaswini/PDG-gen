import java.io.*;

public class Main{
	public static void main(String args[]){
		BufferedReader line=new BufferedReader(new InputStreamReader(System.in));
		try{
			String str=line.readLine();
			int[] cnt;
			cnt =new int[30];
			for(int i=0;i<=29;i++)cnt[i]=0;
			for(int i=0;i<str.length();i++){
				char s=str.charAt(i);
				if(s>='A' && s<='Z')cnt[(int)(s-'A')]++;
				if(s>='a' && s<='z')cnt[(int)(s-'a')]++;
			}
			for(int i=0;i<26;i++)System.out.printf("%c : %d\n",i+'a',cnt[i]);
		}catch (IOException e){
			System.out.println(e);
		}
	}
};