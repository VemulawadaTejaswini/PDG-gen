import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder=new StringBuilder();

		while(true){
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			if(x==0 && y==0) break;
			if(x > y){
				int tmp = x;
            	y = x;
            	x = tmp;
            }
			builder.append(x + " " + y + "\n");
           }
		System.out.println(builder.toString());
		br.close();
	}
}