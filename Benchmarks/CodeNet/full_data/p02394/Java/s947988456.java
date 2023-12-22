import java.io.*;
class Main{
	public static void main (String[] args)throws IOException{

	BufferedReader br =
	new BufferedReader(new InputStreamReader(System.in));

	String w = br.readLine();
	String h = br.readLine();
	String x = br.readLine ();
	String y = br.readLine();
	String r = br.readLine();

	int num1 = Integer.parseInt(w);
	int num2 = Integer.parseInt(h);
	int num3 = Integer.parseInt(x);
	int num4 = Integer.parseInt(y);
	int num5 = Integer.parseInt(r);

	if ( num3 + num5 <= num1 && num4 + num5 <= num2 && num3 - num5 >= 0 && num4 - num5 >= 0 ){
	System.out.println("Yes");
	}
	else{
	System.out.println("No");
	}
    }
}
	