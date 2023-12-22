import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int a;
		int b;
		 a = Integer.parseInt(br.readLine());//値段を入力
		 sannjyou sa=new sannjyou();
		 b=sa.sann(a);
		
		System.out.println(b);
	}

}

public class sannjyou {

	private int a;
	
	public int sann (int b){
		a=b;
		int k;
		k=a*a*a;
		return k;
	}

}