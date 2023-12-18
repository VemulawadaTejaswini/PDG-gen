import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		long N=sc.nextLong();
		long ans=0;
		for (int i=1;i<=N;++i) {
			if (i%3!=0&&i%5!=0) ans+=i;
		}
		pw.println(ans);
		pw.close();
	} 
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
	
    public static void main(String[] args) {
    	new Main().run();
    }
}
