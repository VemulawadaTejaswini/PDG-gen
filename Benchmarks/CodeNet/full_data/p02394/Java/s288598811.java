import java.io.*;

public class Maim {
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		
		String[] size = str.split(" ");
		int[] Num = new int[5];
		
		int W = Integer.parseInt(size[0]);
		int H = Integer.parseInt(size[1]);
		int x = Integer.parseInt(size[2]);
		int y = Integer.parseInt(size[3]);
		int r = Integer.parseInt(size[4]);
		
		if(x-r >= 0 && y-r >= 0 && x+r <= W && y+r <= H){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}