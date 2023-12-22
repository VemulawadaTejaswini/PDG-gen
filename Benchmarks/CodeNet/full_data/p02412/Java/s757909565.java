import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n=stdIn.nextInt();
			int x=stdIn.nextInt();
			if(n==0)
				break;
			int ans=0;
			for(int i=1;i<n;i++){
				for(int j=i+1;j<n;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x)
							ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}