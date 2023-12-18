import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split("\\s+");
		String n = s[0];
		int m = Integer.parseInt(s[1]);
		
		s = br.readLine().split("\\s+");
		int[] like = new int[10-m];
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<m;i++)
			set.add(Integer.parseInt(s[i]));
		int k = 0;
		for(int i=0;i<10;i++)
		{
			if(!set.contains(i))
				like[k++] = i;
		}
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		
		for(int i=0;i<n.length();i++)
		{
			int j = (int)(n.charAt(i)-48);
			int q = Arrays.binarySearch(like, j);
			if(q<0)
				q = Math.abs(q)-1;
			if(flag)
				sb.append(like[0]);
			else if(q<like.length)
				sb.append(like[q]);
			else
			{
				if(i==0)
				{
					if(like[0] == 0)
						sb.append(like[1]);
					else
						sb.append(like[0]);
				}
				sb.append(like[0]);
			}
			
			if(set.contains(j))
				flag = true;
		}
		System.out.println(sb);
	}
}
