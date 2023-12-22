import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{

	public static void main(String[] args) throws IOException{
		// 入力導入部
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			
			String str=br.readLine();
			if(str.equals("0"))break;
			String[] st=str.split("");
			int x=0;
			for(int i=0;i<st.length;i++){
				x=x+Integer.parseInt(st[i]);
				}
			System.out.println(x);
		}br.close();

		}}