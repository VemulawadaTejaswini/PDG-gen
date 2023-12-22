import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int i, l, sum;
		try{
			while(null != (line=reader.readLine())){
				linearr = line.split("");
				sum = 0;
				if(Integer.parseInt(linearr[0]) == 0){
					return;
				}
				for(i=0, l=line.length(); i<l; i++){
					sum += Integer.parseInt(linearr[i]);
				}
				System.out.println(sum);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}