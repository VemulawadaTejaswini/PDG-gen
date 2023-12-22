import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		while((str=br.readLine())!=null){
			String[] num=str.split(" ");
			int a=Integer.parseInt(num[0]),
				b=Integer.parseInt(num[1]);
			System.out.println(gcd(a,b)+" "+lcm(a,b));
			
		}
	}
	
	public static int gcd(int a,int b){
		return b==0 ? a : gcd(b,a%b);
	}
	
	public static int lcm(int a,int b){
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		int back=max;
		int i=1;
		while(back%min!=0){
			back=max*i++;
			//System.out.println(back);
		}
		
		return back;
	}

}