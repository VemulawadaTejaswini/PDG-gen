import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int a=in.nextInt(),b=in.nextInt();
		out.printf("%d %d %f", a/b,a%b,(double)a/b);
		out.flush();
	}

}

