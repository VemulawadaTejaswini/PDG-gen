import java.io.*;
class Main
{
 int A;
 int B;
 int ans;
 public static void main(String[] args) throws IOException
 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str1 = br.readLine();
	int A = Integer.parseInt(str1);
	String str2 = br.readLine();
	int B = Integer.parseInt(str2);
	if(A>2*B)
	System.out.println(A%(2*B));
	else
	System.out.println('0');

 }
}

