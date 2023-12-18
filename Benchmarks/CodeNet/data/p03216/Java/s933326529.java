/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s;
		ArrayList<String> al = new ArrayList<>();
		sc.nextLine();
		s = sc.nextLine();
		StringBuilder d,m,c;
		d = new StringBuilder();
		m = new StringBuilder();
		c = new StringBuilder();
		for(int i = 0;i < s.length();i++)
		{
		    if(s.charAt(i) == 'D')
		    {
		    d.append(i);
		    d.append(",");
		    }
		    else if(s.charAt(i) == 'M')
		    {
		    m.append(i);
		    m.append(",");
		    }
		    else if(s.charAt(i) == 'C')
		    {
		    c.append(i);
		    c.append(",");
		    }
		}
		String[] D = d.toString().split(",");
		String[] M = m.toString().split(",");
		String[] C = c.toString().split(",");
		for(int i = 0;i < D.length;i++)
		{
		    for(int j = 0;j < M.length;j++)
		    {
		        if(Integer.parseInt(D[i]) < Integer.parseInt(M[j]))
		        {
		        for(int l = 0;l < C.length;l++)
		        {
		            if(Integer.parseInt(M[j]) < Integer.parseInt(C[l]))
		            al.add(D[i]+","+M[j]+","+C[l]);
		        }
		        }
		    }
		}
		int a;
		int q = sc.nextInt();
		while(q-- != 0)
		{
		    a = 0;
		    int k = sc.nextInt();
		    for(String s1 : al)
		    {
		        String[] s2 = s1.split(",");
		        if(Integer.parseInt(s2[2]) - Integer.parseInt(s2[0]) < k)
		        a++;
		    }
		    System.out.println(a);
		}
	}
}