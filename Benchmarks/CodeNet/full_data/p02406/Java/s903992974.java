import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str=input.readLine();
		int n=Integer.parseInt(str);
		if(n%3==0){
			for(int i=0;i<n/3;i++){
				sb.append(" ").append(3*(i+1));
			}
		}	
		
		System.out.print(sb);
	}
}