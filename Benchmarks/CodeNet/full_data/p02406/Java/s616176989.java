import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;
		
		while((str=br.readLine())!=null){
			n=Integer.parseInt(str);
			for(int i=1;i<=n;i++){
				int x=i;
				if(x%3==0){
					System.out.print(" "+i);
					continue;
				}
				if(x%10==3){
					System.out.print(" "+i);
					continue;
				}
				x/=10;
			}
			break;
		}
		br.close();
	}
}