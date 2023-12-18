import java.util.*;

public class Main{
	public static  void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		int max = 0;
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++){
			num[i] = scan.nextInt();
			if(max > num[i]){
				max = num[i];
			}else{
				sum += num[i];
			}
		}
		
		if(max < sum + 1){
			System.out.println("Yes");
		}else if(max < sum){
			System.out.println("No");
		}
	}
}