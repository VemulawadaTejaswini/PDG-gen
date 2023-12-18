
//import java.io.*;
import java.util.*;

class TestClass {

	//static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args){
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		/*String s[] = in.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);*/
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println((a+b)%24);
		//out.close();
	}

}
