import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n;
		int ans =1;
		try{
			while((s=reader.readLine()) !=null){
				n=Integer.parseInt(s);
				for(int i=1;i<=n;i++){
					ans *= i;
				}
				System.out.println(ans);
				ans=1;
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}