import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		int n = s.length();
		int m = t.length();
		
		int[] cnext = new int[26];
		int[][] next = new int[n][26];
		for(int i = 0; i < 26; i++)
			cnext[i]=-1;
		for(int i = 0; i < n; i++)
		{ //what chars exist?
			cnext[s.charAt(i)-'a'] = 0;
		}
		
		for(int i = n-1; i >= 0; i--)
		{
			int cid = s.charAt(i)-'a';
			
//			System.out.println(cid + " " + i);
			for(int j = 0; j < 26; j++)
			{
				next[i][j] = cnext[j];
			}
			cnext[cid] = i;
		}
//		System.out.println("test " + next[0][13]);
		
		long an = 0;
		int ch = 0; //char in s
		for(int i = 0; i < m; i++)
		{
//			System.out.println("i: " + i + ", ch " + ch);
			int tar = t.charAt(i)-'a';
			
			int got = next[ch][tar];
			if(tar == s.charAt(ch)-'a')
			{ //right here!
				an++;
				ch++;
				while(ch>=n)ch-=n;
			}
			else if(got == -1)
			{
//				System.out.println(" No " + i + "tar " + tar);
				System.out.println(-1);
				return;
			}
			else if(got == 0)
			{ //new s!
				an += n - ch;
				i--; //look again from 0!
//				System.out.println("MARK " + ch + " " + (char)('a'+tar) );
				ch = 0;
				
//				if(flag)return; //don't
			}
			else
			{
				an += got+1-ch;
				ch = got+1;
				while(ch>=n)ch-=n;
			}
			
		}
		
		System.out.println(an);

	}

}
