import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		while(true){
			String[] str=br.readLine().split(" ");
			int H=Integer.parseInt(str[0]);
			int W=Integer.parseInt(str[1]);
			
			if(H==0&&W==0) break;
			
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					sb.append("#");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}