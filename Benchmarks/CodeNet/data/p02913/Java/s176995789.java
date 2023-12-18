import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
//		int n = s.length();
		

		
		long[] mat = new long[n];
		long score = 0;
		
//		System.out.println(Arrays.toString(kmp));
		for(int s1 = 1; s1 < n; s1++)
		{
			//get longest match in substring 0...s1-1
			
			//prepare kmp
			int[] kmp = new int[s.length()-s1];
			{ //for each index of s i, find its longest proper prefix that's also its suffix.
				//"proper" prefix meaning it can't be the whole string s[0...i],
				//which is why for i=0, the length is 0.
				int i = 1, j = 0;
				while(i < s.length()-s1)
				{
//					System.out.println("i = " + i + ", j = " + j);
					if(s.charAt(i+s1) == s.charAt(j+s1))
					{
						kmp[i] = j+1; //i is the length of prefix that's also current suffix
						j++;
						i++;
					}
					else if(j == 0)
					{ //mismatch
						kmp[i] = 0;
						i++;
					}
					else
					{  //mismatch: try again with j rolled back
						//kmp[i] = j+1;
						j = kmp[j-1];
					}
				}
			}					
			
			//begin search
			int j = 0;
			int i = 0;
			int c = 0;
//			System.out.println("START");
			
//			System.out.println("s1 " + s1 + ": " + s.substring(s1));
			while(i < s1)
			{
//				System.out.println(i + " " + j);
				if(s.charAt(i) == s.charAt(j+s1))
				{
					int otherstart = i-j;
					mat[s1] = Math.max(mat[s1], j+1);
//					System.out.println(i + " " + j + " " + s1);
//					System.out.println("match at " + i + " " + (j) + ", otherstart " + otherstart+ ", the match is " + s.substring(otherstart,otherstart+j+1));
					if(j+1>score)
					{
//						System.out.println("match at " + i + " " + (j) + ", otherstart " + otherstart+ ", the match is " + s.substring(otherstart,otherstart+j+1));
					}
					score = Math.max(score, (j+1));
					mat[otherstart] = Math.max(mat[otherstart], j+1);
					if(j+s1 == s.length()-1)
					{ //whole pattern matched
						break;
					}
					else
					{ //letter matched: go to next letter
						i++;
						j++;
					}
				}
				else
				{ //mismatch
					if(j > 0)
					{
						j = kmp[j-1]; 
					}
					//skip some of already-matched letters, rather than restarting with j=0
					else
					{
						j = 0;
						i++;
					}
				}
				
			}			
			
		}
		System.out.println(score);
		

	}

}
