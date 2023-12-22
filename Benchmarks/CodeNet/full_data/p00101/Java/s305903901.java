import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int n = 0; // ????????????????????°
		String str;
		String num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = br.readLine(); //????????????????????°??\???
		n = Integer.parseInt(num);
		for(int i = 0 ; i < n; ++i){
			str = br.readLine();
			str = str.replace("Hoshino", "Hoshina");
			System.out.println(str);
		}
	}

}