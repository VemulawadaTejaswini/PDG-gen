import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		StringTokenizer stk=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(stk.nextToken());
		int b=Integer.parseInt((String)stk.nextElement());
		System.out.println(yakusuu(a,b));
	}
	static int yakusuu(int a,int b){
		int t=0;
		for(int i=1;i<=a;i++){
			if((a%i)==0&&(b%i)==0)t=i;
		}
		return t;
	}

}