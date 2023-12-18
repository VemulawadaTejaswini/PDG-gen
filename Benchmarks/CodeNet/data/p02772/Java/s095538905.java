
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] as = br.readLine().split(" ");
		boolean flag = true;
		for(int i = 0 ; i< n ;i++) {
			int a = Integer.parseInt(as[i]);
			if(a % 2 == 0) {
				if(a % 3 != 0 &&  a%5 != 0 ) {
					flag = false;
					break;
				}
			}
		}
		if(flag ) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
		
	}

}
