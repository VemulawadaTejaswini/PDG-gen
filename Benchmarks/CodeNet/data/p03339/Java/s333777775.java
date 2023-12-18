import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<Integer> sumWE = new ArrayList<Integer>();
		int a = sc.nextInt();
		int E = 0;
		int W = a - 1;
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
				}else if (array.get(k).equals("E")) {
					countE++;
				}else if (array.get(k).equals("W")) {
					countW++;
				}
			}
			countE = E - countE;
			countW = W - countW;
			sumWE.add(Math.abs(countE) + Math.abs(countW));
			countE = 0;
			countW = 0;
			E++;
			W--;
		}
		for(int l = 0;l < a;l++){
			if (sum > sumWE.get(l)) {
				sum = sumWE.get(l);
			}
		}
		System.out.println(sum);
	}
}
