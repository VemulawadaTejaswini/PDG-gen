import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int[] num = new int[S.length()+1];
		num[0] = 0;
		for(int i = 1;i < S.length()+1;i++){
			if(S.charAt(i-1)=='<'){
				num[i] = num[i-1] + 1;
			}else{
				num[i] = num[i-1] - 1;
			}
		}
		int min1 = Arrays.stream(num).min().getAsInt();
		if(min1 < 0){
			for(int i = 0;i < num.length;i++){
				if(num[i] <= 0){
					num[i] -= min1;
				}
			}
		}
		System.out.println(Arrays.stream(num).sum());
	}
}