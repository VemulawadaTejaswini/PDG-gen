import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		char[] c;
		int sum;
		while(true){
			sum = 0;
			str = buf.readLine();
			if(str == "0")
				break;
			c = str.toCharArray();
			for(int i=0; i<c.length ; i++){
				sum += Integer.parseInt(Character.toString(c[i]));
			}
			System.out.println(sum);
		}

	}
}