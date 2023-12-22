import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String s = buf.readLine().toLowerCase();
		String[] str;
		int count=0;

		while(true){
			str = buf.readLine().split(" ");
			if(str[0].equals("END_OF_TEXT"))
				break;

			for(int i=0; i<str.length; i++){
				
				if(s.equals(str[i].toLowerCase()))
					count++;
			}

		}
		System.out.println(count);
	}
}