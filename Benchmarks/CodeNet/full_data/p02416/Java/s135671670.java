import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		long sum;
		while(Long.parseLong(s)!=0){
			sum = 0;
			for(int i=0; i<s.length(); i++){
				sum += Character.getNumericValue(s.charAt(i));
			}
			System.out.println(sum);
			s = br.readLine();
		}
		
		br.close();
	}
}