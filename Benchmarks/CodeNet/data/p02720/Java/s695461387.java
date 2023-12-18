import java.util.Scanner;

// https://atcoder.jp/contests/abc161/tasks/abc161_d
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();




		int num = 0;
		long i = 1;
		while(true) {
			int[] array = split(i);
			boolean flag = check(array);
			if(flag) {
				num = num + 1;
			}

			if(num==k) {
				System.out.println(i);
				return;
			}
			i = i + 1;
		}
	}

	public static int[] split(long k) {
		int length = String.valueOf(k).length();
		int[] array = new int[length];
		for(int i=length;i!=0;i--) {
			array[i-1] = (int) (k/Math.pow(10, i-1));
			k = (long) (k%(int)Math.pow(10, i-1));
		}
		return array;
	}

	public static boolean check(int[] array) {
		boolean flag =true;
		int length = array.length;
		for(int i =0;i<length-1;i++) {
			if(!(Math.abs(array[i]-array[i+1])<=1)) {
				flag = false;
			}
		}
		return flag;
	}
}
