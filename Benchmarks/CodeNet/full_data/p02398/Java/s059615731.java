import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		
		String[] ArrayX = new String[3];
		int[] Numbers = new int[3];
		int cnt = 0;
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		ArrayX = str.split(" ");
		
		Numbers[0] = Integer.parseInt(ArrayX[0]);
		Numbers[1] = Integer.parseInt(ArrayX[1]);
		Numbers[2] = Integer.parseInt(ArrayX[2]);
		
		if(Numbers[0]<=Numbers[1]) {
			for(int i = Numbers[0]; i<=Numbers[1]; i++) {
				if(Numbers[2]%i==0){
					cnt++;
				}
			}
		}
		else
			cnt = 0;
		
			System.out.println(cnt);
	}
}