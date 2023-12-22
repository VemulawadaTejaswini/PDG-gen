import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int temp;
	while(true){
		String str = br.readLine();
		String[] starry = str.split(" ");
		
		int x = Integer.parseInt(starry[0]);
		int y = Integer.parseInt(starry[1]);
		if(x == 0 && y == 0){
		      break;
		}
		else if(x>y){
			temp = x;
			x = y;
			y = temp;
		}
		sb.append(x).append(" ").append(y).append("\n");
	}
		System.out.println(sb);
	}
}