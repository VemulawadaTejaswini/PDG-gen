import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String x = null;
		while(true){
			x = sc.next();
			if(x.equals("0")){
				break;
			}
			char[] nums = x.toCharArray();
			int sum = 0;
			for(char data: nums){
				sum += Integer.parseInt(String.valueOf(data));
			}
			System.out.println(sum);
		}
	}
}


