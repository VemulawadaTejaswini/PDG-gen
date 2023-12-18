import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == '0')
				l.add(0);
			else if(s.charAt(i) == '1')
				l.add(1);
			else
			{
				if(!l.isEmpty())
					l.remove(l.size()-1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i: l)
			sb.append(i);
		System.out.println(sb);
	}

}
