
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		line = br.readLine();
		String text[] = line.split(" ");
		int a[] = new int[N];
		
		int max = 0, min = 0;
		
		for(int i = 0; i < text.length;i++){
			a[i] = Integer.parseInt(text[i]);
//			
//			if(max < a[i]){
//				max = a[i];
//			}
//			if(min > a[i]){
//				min = a[i];
//			}
//			System.out.println(a[i]);
		}
		//最小コスト
		int res = 1000000000;
		
		for(int i = -100; i <= 100; i++){
			int cost = 0;
			for(int k = 0; k < a.length; k++){
				cost += Math.pow(i -a[k] , 2);
			}
			if(cost < res)res = cost;
		}
		System.out.println(res);
	}
}
