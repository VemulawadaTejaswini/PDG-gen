import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int num[]=new int[100001];int j=0;int spaceFound=0;int total=0;int fin=0;
		o1:do
		{
			try {
				num[j]=System.in.read();
			} catch (IOException e) {
				break o1;
			}
			if(num[j]=='\n'){
				total=j-1;
				break o1;
			}
			j++;
		}
		while(true);
		
		Scanner s = new Scanner(System.in);
		
		int K=Integer.parseInt(s.next());
		
		
		for(j=0;j<total;j++)
		{
			num[j]-=97;
		}
		
		//base 26 start from0
		j=0;
		o:while(K>0)
		{
			if(j==total-1)
			{
				K--;
				num[j]=(1+num[j])%26;
			}
			else
			{
				if(K<26-num[j])
				{
					j++;
					continue o;
				}//else
				K-=26-num[j];
				num[j]=0;
				j++;
			}
		}

		for(j=0;j<total;j++)
		{
			System.out.print((char)(num[j]+97));
		}
	}

}
