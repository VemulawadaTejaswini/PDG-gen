import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static int n;
	public static int s;
	public static int[] k;
	public static boolean[] used = new boolean[10];
	public static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
		//System.out.println(getNth(543, 1));
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			k = new int[n];
			sum = 0;
			Arrays.fill(used, false);
			setNth(0);
			System.out.println(sum);
		}
	}
	
	public static void setNth(int num){
		//全部セットし終えていたら
		if(num == n){
			int tmp = 0;
			for(int i = 0; i < n; i++){
				tmp += (i + 1) * k[i];
			}
			if(tmp == s){
				//print(k);
				sum++;
			}
		}
		else{
			for(int i = 0; i < 10; i++){
				if(used[i] == false){
					k[num] = i;
					used[i] = true;
					setNth(num + 1);
					used[i] = false;
				}
			}
		}
	}
	
	public static void print(int[] array){
		for(int i : array){
			System.out.print(i + " ");
		}
		System.out.println();
	}
//	
//	//nのk桁目の数字を返す関数
//	public static int getNth(long n, int k){
//		long tmp = n % (long)Math.pow(10, k);
//		tmp /= (long)Math.pow(10, k - 1);
//		return (int)tmp;
//	}

}