import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM {
	public static int numint[];
	public static int multiplied[];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String countstr=str;
		int countint=Integer.parseInt(countstr);
		str=br.readLine();
		String numstr[]=str.split(" ",0);
		new numint[countint-1];
		for (int i=1;i<=count;i++){
			numint[i-1]=Integer.parseInt(numstr[i-1]);
		}
		new multiplied[countint-1];
		multiplied[0]=numint[0];
		for(int j=1;j<=count;j++){
			multiplied[j]=multiplied[j-1]*numint[j]/Euclid(j-1);
		}
		System.println(multiplied[count]);
		
	}
	public static int Euclid(int k){
		int x=multiplied[k];
		int y=numint[k+1];
		while (x!=y){
			if (x<y){
				y=y-x;
			}else{
				x=x-y;
			}
		}
		return x;
	}
}