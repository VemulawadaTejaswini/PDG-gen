
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null)
		{
			int n=Integer.parseInt(str);
			int debt=100000;
			System.out.println(debt(debt,n));


		}
	}

	static int debt(int debt,int n)
	{
		int add=(int)Math.ceil(((int)Math.round(debt*5.0/100.0))/1000.0)*1000;
		debt+=add;
		n--;
		if(n>0){return debt(debt,n);}
		else{return debt;}
	}



}