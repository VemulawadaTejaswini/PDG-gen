import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws IOException{
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			int line = 0;
			String str1=br.readLine();
			String str2=br.readLine();
			int[][] x=new int[str1.length()+1][str2.length()+1];
			//str1=" "+str1;
			//str2=" "+str2;	
			for(int j=1;j<=str1.length()-1;j++){
				for(int k=1;k<=str2.length()-1;k++){
					String a=str1.substring(j-1, j);
					String b=str2.substring(k-1, k);
					if(a.equals(b)) x[j][k]=x[j-1][k-1]+1;
					else x[j][k]=Math.max(x[j-1][k],x[j][k-1] );
					line=Math.max(line, x[j][k]);
				}
				
			}
			System.out.println(line);
		}
		br.close();
	}
}