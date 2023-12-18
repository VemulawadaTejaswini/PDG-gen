import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer(br.readLine());
        int A =Integer.parseInt(in.nextToken());
        int B =Integer.parseInt(in.nextToken());
        in = null;
		br=null;
		int ans = A + Math.abs(B);
		System.out.println(Math.max(ans, A * B));

	}



}