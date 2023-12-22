import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
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
		
		long maxNum = 0;
		long minNum = 0;
		long sum = 0;
		for(int i=0; i<kosu; i++) {
			int num = Integer.parseInt(ArrayX[i]);
			
			if(i == 0) {
				minNum = num;
			} else if(num < minNum) {
				minNum = num;
			}
			
			if(maxNum < num) {
				maxNum = num;
			}
			sum += num;
		}
		
		System.out.println(minNum + " " + maxNum + " " + sum);
	}
}