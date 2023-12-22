import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String str1,str2;
		int m=0;
		int h=0;

		while(true){
			str = buf.readLine();
			if(str.equals("-"))
				break;
			m = Integer.parseInt(buf.readLine());
			for(int i=0; i<m; i++){
				h = Integer.parseInt(buf.readLine());
				str1 = str.substring(0,h);
				str2 = str.substring(h);
				str = str2.concat(str1);
			}
			System.out.println(str);
		}	
		
		
		
	}
}