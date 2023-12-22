import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split("[,\\.\\s]+");
		for(int i = 0; i < tmp.length; i++){
			if(tmp[i].length()<=2 || tmp[i].length()>=7)continue;
			else System.out.print(tmp[i] + " ");
		}

	}
}