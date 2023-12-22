import java.io.*;

class Main{
	
	public static void main(String args[]) throws IOException{
		String words;
		int num=0;
		
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		words = br.readLine();
		
		for(char i='a'; i<= 'z';i++){
			for(int j=0;j<words.length();j++){
				if(i == words.charAt(j)){
					num++;
				}
			}
			
			System.out.println(i+" : "+num);
			
			num=0;
		}
	}
}