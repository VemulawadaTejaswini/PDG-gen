import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer(br.readLine());
        String S1 =in.nextToken().substring(0, 1);
        String S2 =in.nextToken().substring(0, 1);
        String S3 =in.nextToken().substring(0, 1);
        String ans = S1 + S2 + S3;


        in = null;

		br=null;
		System.out.println(ans.toUpperCase());

	}



}