import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s="";
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        int menseki=a*b;
		int gaisyu=2*(a+b);

		System.out.print(menseki);
		System.out.print(gaisyu);

	}

}

