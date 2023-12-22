import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int N, count = 0;
		
		while(str != null){
			N=Integer.parseInt(str);
			for(int i=1;i<=N;i++){
				if(sosuCheck(i)){
					count++;
				}
			}
			System.out.println(count);
			count=0;
			str=br.readLine();
		}

	}
	
	public static boolean sosuCheck(int num){
		if(num==1){
			return false;
		}
		
		int i=2;
		
		while(i<num){
			if(num%i==0){
				return false;
			}
			i++;
		}
		return true;
	}

}