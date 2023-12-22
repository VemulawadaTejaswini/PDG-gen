import java.io.*;

public class Main{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		for(int i = 0;i<count;i++){
			if(i%3==0){System.out.print(" "+i);}
			else if(String.valueOf(i).contains("3")){System.out.println(" "+i);}
		}
	}
}