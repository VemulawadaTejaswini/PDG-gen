import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int sum=0;
		while((str=br.readLine()) != null) {
			if(!str.isEmpty()) {
				StringTokenizer tkn = new StringTokenizer(str, " ");
				sum = Integer.parseInt(tkn.nextToken())+Integer.parseInt(tkn.nextToken());
				System.out.println((String.valueOf(sum)).length());
			}
		}
    }
}