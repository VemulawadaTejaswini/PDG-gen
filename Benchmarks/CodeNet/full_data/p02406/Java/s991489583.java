import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str=input.readLine();
		int n=Integer.parseInt(str);
		for(int i=0;i<n;i++){
			if((i%3==0||i%10==3)&&!(i==0)){
				sb.append(" ").append(i);
			}
		}	
		
		System.out.print(sb);
	}
}