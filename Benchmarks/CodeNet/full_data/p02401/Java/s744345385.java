import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int ans=0;
	while(true){
		String str=input.readLine();
		String[] atr=str.split(" ");
		int a=Integer.parseInt(atr[0]);
		String op=atr[1];
		int b=Integer.parseInt(atr[2]);
		if(op.equals("+")){
			sb.append(a+b).append("\n");
		}
		if(op.equals("-")){
			sb.append(a-b).append("\n");
		}
		if(op.equals("*")){
			sb.append(a*b).append("\n");
		}

		if(op.equals("/")){
			sb.append(a/b).append("\n");
		}
		if(op.equals("?")){
			break;
		}	

		}
			System.out.println(sb);
		
	}
}