import java.io.*;

class aoj0002{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while ((line = br.readLine()) != null){
			String[] strary = line.split(" ");
			int num1 = Integer.parseInt(strary[0]);
			int num2 = Integer.parseInt(strary[1]);
			System.out.println(String.valueOf(num1+num2).length()+"\n");
		}
		br.close();
	}
}