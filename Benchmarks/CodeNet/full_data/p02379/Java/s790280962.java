import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		double p;
		double ans;
		double p1[] = {Integer.parseInt(str[0]),Integer.parseInt(str[1])};
		double p2[] = {Integer.parseInt(str[2]),Integer.parseInt(str[3])};
		p = ((p2[0]-p1[0])*(p2[0]-p1[0]))+((p2[1]-p1[1])*(p2[1]-p1[1]));
		ans = Math.sqrt(p);
		System.out.println(ans);

	}
}