import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");
		int w = Integer.parseInt(s[0]);
		int h = Integer.parseInt(s[1]);
		int x = Integer.parseInt(s[2]);
		int y = Integer.parseInt(s[3]);
		int r = Integer.parseInt(s[4]);

		if((x + r) < w){
			if(0 <=(x-r)){
				if((y + r) < h){
					if(0 <=(y-r)){
						System.out.println("Yes");
					}else{
						System.out.println("No");
					}
				}else{
					System.out.println("No");
				}
			}else{
				System.out.println("no");
			}
		}else{
			System.out.println("No");
		}

	}
}