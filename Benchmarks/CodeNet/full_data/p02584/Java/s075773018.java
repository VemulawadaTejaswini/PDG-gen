import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		Integer X = sc.nextInt();
		Integer K = sc.nextInt();
		Integer D = sc.nextInt();
		sc.close();

		Integer temp[] = new Integer[K];

		for(int i=0; i<K; i++) {
			if(X>0){
				X = X - D;
				temp[i] = X;
			}
			else if(X<0) {
				X = X + D;
				temp[i] = X;
			}
		}

		int min = 0;
		for(int i=0; i<K; i++) {
			if(i>=1) {
				if(Math.abs(temp[i])>Math.abs(temp[i-1])) {
					min = i-1;
				}
			}	
		}

		int result = 0;
		if((K - min + 1)%2==0) {
			//偶数回
			result = Math.abs(temp[min]);
		}
		else {
			//奇数回
			int l = temp.length;
			if(min - 1 < 0) {
				result = Math.abs(temp[min]);
			}
			else if(min + 1 > l -1) {
				result = Math.abs(temp[min]);
			}
			else {
			result = ( Math.abs(temp[min-1]) < Math.abs(temp[min+1]) ) ?
					Math.abs(temp[min-1]) : Math.abs(temp[min+1]);
			}
			}

		System.out.println(result);
	}
}
