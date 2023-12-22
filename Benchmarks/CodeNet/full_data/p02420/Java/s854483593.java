import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String n,sub;

		while(true){
			n= br.readLine();
			if(n.equals("-")){
				break;
			}
			int num = Integer.parseInt(br.readLine());
			int h[] = new int[num];
			for(int i = 0 ; i < num ; i++){
				h[i]= Integer.parseInt(br.readLine());
				sub = n.substring(0, h[i]);
				n +=sub;
				n = n.substring(h[i]);
			}
			System.out.println(n);
		}


	}

}