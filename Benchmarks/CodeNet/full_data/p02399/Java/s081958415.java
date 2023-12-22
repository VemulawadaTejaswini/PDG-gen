import java.io.*;

class Main {
	public static void main(String[] args){
		int a, b, d, r;
		float f;
		String buf;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			buf = br.readLine();
			
			String[] line = buf.split(" ");
			
			a = Integer.parseInt(line[0]);
			b = Integer.parseInt(line[1]);
			
			d = a/b;
			r = a % b;
			f = (float)a/b;
			
			System.out.print(d+" "+r+" "+f);
		} catch(Exception e){
		}
		System.out.print("\n");
	}
}