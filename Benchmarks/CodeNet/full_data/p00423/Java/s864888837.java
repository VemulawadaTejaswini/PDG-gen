import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(in.readLine());
			if(n == 0){
				break;
			}
			int aa = 0;
			int ba = 0;
			for(int i= 0; i < n;i++){
				String s = in.readLine();
				String[] ss = s.split(" ");
				int a = Integer.parseInt(ss[0]);
				int b = Integer.parseInt(ss[1]);
				if(a < b){
					ba = ba + a + b;
				}
				else if(b < a){
					aa = aa + a + b;
				}
				else{
					aa = aa + a;
					ba = ba + b;
				}	
			}
			System.out.println(aa+" "+ba);
		}	

	}

}