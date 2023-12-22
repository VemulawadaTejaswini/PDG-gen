import java.io.*;
public class Main{
	
	public static void main(String[] args)throws IOException{
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strAry = br.readLine().split(" ");
		
		int num = 0;
		int min = 1000000;
		int max = -1000000;
		long sum = 0;
		
		for(int i=0; i<N; i++){
			num = Integer.parseInt(strAry[i]);
			if(num<min) min = num;
			if(num>max) max = num;
			sum += num;
		}
		System.out.println(min + " " + max +  " " + sum);
	
	}

}