import java.io.*;

class Main {
	public static void main(String[] args) throws Exception{
		int x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf = br.readLine();
		StringBuilder sb = new StringBuilder();

		while(true){
		String[] line = buf.split(" ");
		x = Integer.parseInt(line[0]);
		y = Integer.parseInt(line[1]);

			if(x == y && x == 0) break;
			if( x > y) {
				sb.append(y+" "+x);
			} else if ( x < y ) {
				sb.append(x+" "+y);
			}		
		}
	}
}