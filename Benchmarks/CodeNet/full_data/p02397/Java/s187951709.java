import java.io.*;

class Main8 {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String buf = br.readLine();

			while(true){
			 String[] line = buf.split(" ");
			 int x = Integer.parseInt(line[0]);
			 int y = Integer.parseInt(line[1]);			
				if( x == y && x == 0) break;
				if( x > y ){
					System.out.print(y+" "+x);
					break;
				} else if( x < y ) {
					System.out.print(x+" "+y);
					break;
				} 
			}
			System.out.print("\n");
			} catch(Exception e){
			}
	} 
}
		