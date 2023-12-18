import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] aa = new int[n];	//front num
		int[] ba = new int[n];	//back num
		for(int i = 0; i < n; i++) {
			aa[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++) {
			ba[i] = scan.nextInt();
		}

		List<Integer> src = new ArrayList<>();
		List<Integer> res = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			src.add(i);
		}

		int ans = permutation(src, res, 0, aa, ba);

		if(ans == Integer.MAX_VALUE) {
			ans = -1;
		}else {
			ans /= 2;
		}

		System.out.println(ans);


	}

	public static int permutation(List<Integer> src, List<Integer> res, int sum, int[] aa, int[] ba) {
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < src.size(); i++) {
			List<Integer> srcTemp = new ArrayList<>(src);
			List<Integer> resTemp = new ArrayList<>(res);
			int sumTemp = sum;
			int num = srcTemp.remove(i);	//adding number of index
			resTemp.add(num);
			sumTemp += Math.abs(resTemp.size() - 1 - num);

			int temp = permutation(srcTemp, resTemp, sumTemp, aa, ba);
			if(temp < min) {
				min = temp;
			}
		}

		if(src.size() < 1) {

			int temp = check(res, sum, aa, ba);
			if(temp < min) {
				min = temp;
			}
		}

		return min;
	}



	/*
	 * if not increasing, return Integer.MAX_VALUE
	 */
	public static int check(List<Integer> res, int sum, int[] aa, int[] ba) {

		int n = res.size();

		//initialization----------------
		int prev = 0;
		int index = res.get(0);	 //inputed card's primary index
		if((index-0) % 2 == 0) {
			prev = aa[index];
		}else {
			prev = ba[index];
		}
		//------------------------------

		int pres = 0;
		for(int i = 1; i < n; i++) {
			index = res.get(i);
			if((index-i) % 2 == 0) {
				pres = aa[index];
			}else {
				pres = ba[index];
			}

			if(prev > pres) {
				sum = Integer.MAX_VALUE;
				break;
			}

			prev = pres;
		}

		return sum;
	}


}
