import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;double v,y;
		while((t=bf.readLine())!=null){v=Double.parseDouble(t);y=1+v*v/(20*4.9);System.out.println((int)Math.ceil(y));}
	}
}