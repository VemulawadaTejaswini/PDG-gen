import java.util.Arrays;
import java.util.Scanner;

class Main{




	public static void main(String[] args) {





		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0;i < n;i++){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);

		int[] num = new int[1000001];
		for(int i = 0;i < n;i++){
			num[A[i]]++;
		}
		int sum = 0;
		int twonum = 0;
		for(int i = 0;i <= 100000;i++){

			if(num[i] > 0){
				if(num[i] % 2 == 1){
					num[i] = 1;
				}else{
					num[i] =  2;
				}
				sum++;
			}
			if(num[i] == 2){
				twonum++;
			}

//		System.out.println("i " + i + " num "+num[i]);
		}
		if(twonum % 2 == 1){
			System.out.println(sum-1);
		}else{
			System.out.println(sum);
		}



	}
}


class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


