import java.io.*;
class a125
{
	public static void main(String[] args) throws IOException
	{
	int a[]=new int[2];
	int w,h;

	BufferedReader ar =
		new BufferedReader(new InputStreamReader(System.in));
	String str = ar.readLine();
	
	BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
	String str1 = br.readLine();
	
	BufferedReader cr =
		new BufferedReader(new InputStreamReader(System.in));
	String str2 = cr.readLine();
	
	BufferedReader dr =
		new BufferedReader(new InputStreamReader(System.in));
	String str3 = dr.readLine();
	
	a[0] = Integer.parseInt(str);
	a[1] = Integer.parseInt(str1);
	w = Integer.parseInt(str2);
	h = Integer.parseInt(str3);
	
	System.out.println((a[0]-w)*(a[1]-h));
	
	}
	
}	
