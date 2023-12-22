import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> lines = new ArrayList<String>();
		while (br.ready()){
			lines.add(br.readLine());
		}
		String[] tmp = lines.get(0).split(" ");
		int[] num = new int[tmp.length];
		for(int i=0; i<tmp.length; i++){
			num[i] = Integer.parseInt(tmp[i]);
		}
		System.out.println(gcd(num[0],num[1]));

	}
	static int gcd(int x, int y){
		if (x%y ==0)
			return y;
		return gcd(y, x%y);
	}

}