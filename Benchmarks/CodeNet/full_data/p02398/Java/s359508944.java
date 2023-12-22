import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=new String[3];
		int a,b,c;
		int divisor=0;

		try{
			str=br.readLine().split(" ");
			a=Integer.parseInt(str[0]);
			b=Integer.parseInt(str[1]);
			c=Integer.parseInt(str[2]);

			for(int i=a;i<=b;i++){
				if(c%i==0)divisor++;
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println(divisor);
	}
}