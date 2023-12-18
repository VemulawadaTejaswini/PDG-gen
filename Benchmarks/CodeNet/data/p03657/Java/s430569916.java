import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1 {

	public static void main(String[] args) throws IOException
	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			String[] strr=str.split(" ");


			int[] a=new int[3];
			for(int i=0;i<2;i++)
			{		a[i]=Integer.parseInt(strr[i]);
			}

	a[2]=a[0]+a[1];
	String msg="";
	if(a[0]%3==0||a[1]%3==0||a[2]%3==0)
	{msg="Possible";
	}
	else
	{
		msg="Impossible";
	}

	System.out.println(msg);


	}


}
