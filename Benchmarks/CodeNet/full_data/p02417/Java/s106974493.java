import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		while(true)
		{		
			sb.append(br.readLine());
		}
		sb2.append(sb.toString().toLowerCase());
		int[] cnt = new int[26];
		int n;
		for(int i=0;i<26;i++) cnt[i]=0;
		for(int i=0; i<sb2.length(); i++)
		{
			n = sb2.charAt(i)-'a';
			if(n>=0&&n<=26)	cnt[n]++;
		}
		char chr = 'a';
		for(int i=0; i<26; i++)	System.out.println(chr++ + ":" + cnt[i]);
	}
}