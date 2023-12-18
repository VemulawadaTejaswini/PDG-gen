import java.util.Comparator;
import java.util.Scanner;

class Main{




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n+1];
		long[] b = new long[1000001];
		for(int i = 1;i <= n;i++){
			a[i] = sc.nextInt();
			b[a[i]] += sc.nextInt();				//counter
		}
		int p =1 ;
		
		while(k > 0){

			k -= b[p];
			if(k <= 0){
				break;
			}
			p++;


		}
		System.out.println(p);
	}

}

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int)obj1;
		int num2 = (int)obj2;

		if(num1 < num2) {
			return 1;
		} else if(num1 > num2) {
			return -1;
		} else{
			return 0;
		}
	}
}


