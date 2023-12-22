import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int x=0;

		while(true){
		String str=input.readLine();
		String[] str2=str.split(" "); 
		int a=Integer.parseInt(str2[0]);
		int b=Integer.parseInt(str2[1]);
		if(a==0&&b==0){
			break;
		}else{
			if(a>b){
				x=a;
				a=b;
				b=x;
			}
			sb.append(Integer.toString(a)).append(" ").append(Integer.toString(b)).append("\n");
			
		}


		}
		System.out.print(sb);
	}
}