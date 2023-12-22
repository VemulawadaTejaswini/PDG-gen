import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		while(true){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] div = str.split(" ");
			int x = Integer.parseInt(div[0]);	
			int y = Integer.parseInt(div[1]);
			if (x == 0 && y ==0) {
				break;
			}
			else if (x<y){
				System.out.println(x+" "+y);
			}
			else if (x>=y){
				System.out.println(y+" "+x);
			}
		}	
	}
}