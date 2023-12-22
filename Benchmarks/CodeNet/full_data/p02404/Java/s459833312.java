import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String[] str = null;
		for(;;) {
			str = br.readLine().split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			if(w==0&&h==0)break;
			for(int i=0;i<h;i++){
				System.out.print("#");
				for(int l=0;l<w-2;l++){
					if(i==0|i==h-1){System.out.print("#");
					}else System.out.print(".");
				}System.out.println("#");
				}System.out.println();
		}


	}
}