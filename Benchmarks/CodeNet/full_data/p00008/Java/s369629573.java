import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != ( str = bf.readLine() )){
				int n = Integer.parseInt(str);
				if(n > 36){
					System.out.println(0);
				} else {
					System.out.println( calc(n) );
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}

	private static int calc(int number){
		int count = 0;
		for(int i1 = 0; i1 < 10; i1++){
			for(int i2 = 0; i2 < 10; i2++){
				for(int i3 = 0; i3 < 10; i3++){
					for(int i4 = 0; i4 < 10; i4++){
						if(i1 + i2 + i3 + i4 == number)count++;
					}
				}
			}
		}
		return count;
	}

}