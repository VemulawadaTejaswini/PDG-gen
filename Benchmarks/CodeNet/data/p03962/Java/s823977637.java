import java.util.*;
2.import java.lang.*;
3.import java.io.*;
4. 
5.class Main
6.{
7.	public static void main (String[] args) throws java.lang.Exception
8.	{
9.		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
10.		String s = br.readLine();
11.		String[] str = s.split("\\s+");
12.		int[] col = new int[str.length];
13.		for(int i = 0;i < str.length;i++){
14.			col[i] = Integer.parseInt(str[i]);
15.		}
16.		boolean[] penki = new boolean[100];
17.		int cnt = 0;
18.		int sum = 0;
19.		while(cnt < 3){
20.			if(!(penki[col[cnt]])){
21.				penki[col[cnt]] = true;
22.				sum++;
23.			}
24.			cnt++;
25.		}
26.		System.out.print(sum);
27.	}
28.}
