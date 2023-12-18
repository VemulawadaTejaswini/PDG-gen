import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(vd.readLine());
		
		int max=0;
		for(int i=0;i<32;i++) {
			for(int j=0;j<10;j++) {
				int p = (int)Math.pow(i, j);
				if(p<=x&&p>max) {
					max= p;
				}
			}
		}
		System.out.println(max);
	}

}
