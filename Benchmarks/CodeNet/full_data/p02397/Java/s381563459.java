import java.io.*;

class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int x,y,tmp;

		do{
			String str=br.readLine();
			String[] num=str.split(" ");
			x=Integer.parseInt(num[0]);
			y=Integer.parseInt(num[1]);
			if(x>y){
				tmp=x;
				x=y;
				y=tmp;
			}
			if(x!=0&&y!=0){
				sb.append(x).append(" ").append(y).append("\n");
			}
		}while(x!=0||y!=0);
		System.out.print("\n"+sb);
	}
}