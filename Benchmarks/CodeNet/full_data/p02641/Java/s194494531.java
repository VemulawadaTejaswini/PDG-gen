import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] numberInfo =  new int[101];
		for(int i=0;i <n;i ++) {
			numberInfo[sc.nextInt()]++;
		}
		if(numberInfo[x] ==0) {
			System.out.println(x);
			return;
		}
		int right = 0;
		for(int i =x+1; i <=100;i++) {
			if(numberInfo[i] ==0) {
				right = i;
				break;
			}
		}
		int left = 0;
		for(int i =x-1; i >=0;i--) {
			if(numberInfo[i] ==0) {
				left = i;
				break;
			}
		}
		if((right -x) < (x - left)) {
			System.out.println(right);
		}else {
			System.out.println(left);
		}

	}
}