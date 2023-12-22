import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
		int res=0;
		for(int i=a;i<=b;i++) {
			if(c%i==0)res++;
		}
		out.println(res);
		out.flush();
	}

}

