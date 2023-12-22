import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		String W	 = in.readLine();
//		int num = Integer.parseInt(W.split(" ")[0]);

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String ans = "";

		while(N >0) {
			ans=toAlphabet(N%26) + ans;
			N/=26;
		}



		System.out.println(ans);

	}

	static char toAlphabet(int i) {
		switch(i) {
		case 1: return 'a';

		case 2: return 'b';

		case 3: return 'c';


		case 4: return 'd';


		case 5: return 'e';


		case 6: return 'f';


		case 7: return 'g';


		case 8: return 'h';


		case 9: return 'i';


		case 10: return 'j';


		case 11: return 'k';


		case 12: return 'l';


		case 13: return 'm';


		case 14: return 'n';


		case 15: return 'o';


		case 16: return 'p';


		case 17: return 'q';


		case 18: return 'r';


		case 19: return 's';


		case 20: return 't';


		case 21: return 'u';


		case 22: return 'v';


		case 23: return 'w';


		case 24: return 'x';


		case 25: return 'y';


		case 26: return 'z';

		default: return 'a';
		}
	}

	//	//二分探索
	//k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray){
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedArray[mid]<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//二分探索
	//k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList){
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedList.get(mid)<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
        return b == 0 ? a: gcd(b, a % b);
	}
	public static long gcd(long a, long b) {
        return b == 0 ? a: gcd(b, a % b);
	}



}
