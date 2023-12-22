import java.io.*;
 
class Main{
	public static void main(String[] args) throws IOException{

        	int W,H,x,y,r;

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str[] = br.readLine().split(" ");
	        W = Integer.parseInt(str[0]);
	        H = Integer.parseInt(str[1]);
		x = Integer.parseInt(str[2]);
	        y = Integer.parseInt(str[3]);
	        r = Integer.parseInt(str[4]);

		if((x+r)<=W && (x-r)>=0 && (y+r)<=H && (y-r)>=0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}