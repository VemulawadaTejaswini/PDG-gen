import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.w3c.dom.CDATASection;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		String[] cd = vd.readLine().split(" ");
		int h =Integer.parseInt(cd[0]);
		int w =Integer.parseInt(cd[1]);
		for(int i= 0;i<w+2;++i)System.out.print("#");
		for(int i= 0;i<h;++i)System.out.print("#"+vd.readLine()+"#");
		for(int i= 0;i<w+2;++i)System.out.print("#");
	}

}
