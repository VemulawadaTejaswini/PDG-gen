import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int d = Integer.parseInt(tmpArray[0]);
			int w = Integer.parseInt(tmpArray[1]);
			int h = Integer.parseInt(tmpArray[2]);
			
			if(d == 0 && w == 0 & h == 0){
				break;
			}
			
			int n = Integer.parseInt(br.readLine());
			
			int a;
			int b;
			
			if(d >= w && d >= h){
				a = w;
				b = h;
			}
			else if(w >= d && w >= h){
				a = d;
				b = h;
			}
			else{
				a = w;
				b = d;
			}
			
			for(int i = 0; i < n; i++){
				int r = Integer.parseInt(br.readLine());
				
				if(r*2 > Math.sqrt(a*a + b*b)){
					System.out.println("OK");
				}
				else {
					System.out.println("NA");
				}
			}

		}
	}

}