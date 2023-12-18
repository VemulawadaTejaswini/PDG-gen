import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<Integer> sumWE = new ArrayList<Integer>();
		int a = sc.nextInt();
		int sum = a;
		int countE = 0;
		int countW = 0;
		String S = sc.next();
		for (int i = 0; i < a; i++) {
			array.add(S.substring(i,i+1));
		}
		for (int j = 0; j < a; j++) {
			for (int k = 0; k < a; k++) {
				if(j == k){
					continue;
				}else if (k > j && array.get(k).equals("E")) {
					countE++;
				}else if (k < j && array.get(k).equals("W")) {
					countW++;
				}
			}
			sumWE.add(countE + countW);
			countE = 0;
			countW = 0;
		}
		for(int l = 0;l < a;l++){
			if (sum > sumWE.get(l)) {
				sum = sumWE.get(l);
			}
		}
		System.out.println(sum);
	}
}