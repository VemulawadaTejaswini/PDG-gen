import java.io.*;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br= new
				BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str1 = br.readLine();
			int total=0;
			int num1 = Integer.parseInt(str1);
			if(num1==0)break;
			for(int i=0;i<600;i+=num1){
				total+=(i*i*num1);
			}
			System.out.println(total);
		}

	}

}