import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


class Main {
	public static void main(String[] args) throws IOException {
		DecimalFormat df1 = new DecimalFormat("0.00000");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		String[] ss = s.split(" ");
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		System.out.print((a/b)+ " ");
		System.out.print((a%b)+ " ");
		System.out.println(df1.format((double)a/(double)b));
	}

}