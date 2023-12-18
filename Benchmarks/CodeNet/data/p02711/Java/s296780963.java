import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		char[] cs=sc.next().toCharArray();
		boolean ans=false;
		for (char c:cs) ans|=c=='7';
		pw.println(ans?"Yes":"No");
		pw.close();
	} 
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
	
    public static void main(String[] args) {
    	new Main().run();
    }
}
