import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int kosu = Integer.parseInt(str);
		
		String[] ArrayX = new String[kosu];
		
		BufferedReader bw =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = bw.readLine();
		ArrayX = str1.split(" ");	
		
		int maxNum = 0;
		int minNum = 0;
		int sum = 0;
		for(int i=0; i<kosu; i++) {
			int num = Integer.parseInt(ArrayX[i]);
			
			if(num < minNum) {
				minNum = num;
			}
			if(maxNum < num) {
				maxNum = num;
			}
			sum += num;
		}
		
		System.out.println(maxNum + " " + minNum + " " + sum);
	}
}