import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		while(true){
			int num = Integer.parseInt(bf.next());
			int sum = Integer.parseInt(bf.next());
			if(num == 0 && sum == 0) break;
			int min = 0;
			System.out.println(count(num,sum,min));
		}
	}

	static int count(int num, int sum, int min){
		if(min > 9) return 0;
		if(sum == min){
			if(num == 1) return 1;
			else return 0;
		}
		if(sum < min) return 0;
		return count(num-1, sum-min, min+1)+count(num, sum, min+1);
	}
}