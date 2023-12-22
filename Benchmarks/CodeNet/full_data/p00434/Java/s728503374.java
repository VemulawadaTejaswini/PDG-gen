import java.io.*;
public class Main {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean[] submitted=new boolean[30];
		String str=br.readLine();
		for(int i=0;i<30;i++)
			submitted[i]=false;
		for(int i=0;i<28;i++){
			int j=Integer.parseInt(str);
			submitted[j]=true;
			str=br.readLine();
		}
		for(int i=0;i<30;i++)
			if(!submitted[i])
				System.out.println(i);
	}
}