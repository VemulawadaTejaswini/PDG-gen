import java.io.*;

class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		int[] x=new int[10000];
		int i=0,j;
		
		do{
			i++;
			String str=br.readLine();
			int num=Integer.parseInt(str);
			x[i]=Integer.parseInt(num);
		
		}while(x[i]!=0);
		
		for(j=1;j<i;j++){
			System.out.println("Case "+j+":"+x[j]);
		}
	}
}