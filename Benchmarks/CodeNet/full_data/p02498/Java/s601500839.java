import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		new Main().exchange();
	}
	void exchange(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder sb = new StringBuilder(br.readLine());
			for(int i=0; i<sb.length(); i++){
				char ch = sb.charAt(i);
				if(Character.isUpperCase(ch)){
					sb.setCharAt(i, Character.toLowerCase(ch));
				}else{
					sb.setCharAt(i, Character.toUpperCase(ch));
				}
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}