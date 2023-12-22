import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
			String str=br.readLine();
			int n=Integer.parseInt(str);
			
			for(int i=3;i<=n;i++){
				if(i%3==0){
					sb.append(" ").append(i);
				}
				else if(i%10==3){
					sb.append(" ").append(i);
				}
				else if(i/10==3||i/100==3||i/1000==3){
					sb.append(" ").append(i);
				}
			}
		System.out.println(sb);
	}
}