import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tmp = 0;
		int tmpsum = 0;
		int sum = 0;
		for(int i = 1; i <= n; i++){
			tmpsum = 0;
			tmp = i;
			for(int t = 0; t <= 4; t++){
				tmpsum = tmpsum + (tmp % 10);
				tmp = tmp/10;
			}
			if((tmpsum >= a) && (tmpsum <= b)){
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
