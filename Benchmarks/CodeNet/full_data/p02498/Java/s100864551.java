import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder sb = new StringBuilder(br.readLine());
			//
			for(int i=0; i<sb.length(); i++){
				if(Character.isUpperCase(sb.charAt(i))){
					sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
				}else{
					sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
				}
			}
			//
			System.out.println(sb);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}