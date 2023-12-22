import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String num[]=br.readLine().split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		if(a>b){
			System.out.print("a>b");
		}else if(a<b){
			System.out.print("a<b");
		}else System.out.print("a==b");
		
	}
}