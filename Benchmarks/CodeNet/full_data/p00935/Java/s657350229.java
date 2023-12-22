import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String D = br.readLine().replace(" ", "");
		for(int i = 0 ; i <= 100000 ; i++){
			boolean isok = false;
			int length = String.valueOf(i).length();
			for(int j = 0 ; j < D.length() - length + 1 ; j++){
				if(Integer.parseInt(D.substring(j, j + length)) == i){
					isok = true;
					break;
				}
			}
			if(!isok){
				System.out.println(i);
				break;
			}
		}
	}
}