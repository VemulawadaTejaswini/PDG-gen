/*AOJ-ITP-2-1*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		if(a < -1000 || a > 1000 || b < -1000 || b >1000){System.exit(1);}
		
		if(a > b){
			System.out.println("a > b");
		}else if(a < b){
			System.out.println("a < b");
		}else if(a == b){
			System.out.println("a == b");
		}
	}
}