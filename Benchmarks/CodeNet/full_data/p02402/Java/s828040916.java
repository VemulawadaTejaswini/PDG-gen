import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = "", ai = "";
		int max = 0, min = 0, goukei = 0;
		n = br.readLine();
		ai = br.readLine();
		
		String [] hairetsu = ai.split(" ");
		
		int ary[] = new int[Integer.parseInt(n)];
		
		for(int i = 0; i < hairetsu.length; i++) {
			ary[i] = Integer.parseInt(hairetsu[i]);
		}
		
		min = ary[0];
		max = ary[0];
		
		for(int i = 0; i < ary.length; i++) {
			goukei = goukei + ary[i];
			if(min > ary[i]) {
				min = ary[i];
			}
			if(max < ary[i]) {
				max = ary[i];
			}
		}
		
		System.out.println(min + " " + max + " " + goukei);
		

	}
}