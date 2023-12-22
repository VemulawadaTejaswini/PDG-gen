import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum;
		String str[];
		while(true){
			sum=0;
			try{
				str=br.readLine().split("");
				if(str[0].equals("0")){
					break;
				}
				for(int i = 0 ; i < str.length ; i++){
					sum += Integer.parseInt(str[i]);
				}
				System.out.println(sum);

			}catch (Exception e) {
				System.err.println(e);
			}
		}
	}

}