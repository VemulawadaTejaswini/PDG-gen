import java.util.Scanner;

public class Main {
	static int[] lengthes;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		lengthes = new int[n];
		for(int i = 0; i < n; i++){
			lengthes[i] = sc.nextInt();
		}
		Pattern.setN(n);
		Pattern.setLengthes(lengthes);
		int p = (int)Math.pow(4, n);
		int minMP = Integer.MAX_VALUE;
		for(int i = 0; i < p; i++){
			Pattern pat = new Pattern(i);
			minMP = Math.min(minMP, pat.calcMP(a, b, c));
		}
		System.out.println(minMP);
	}
}
class Pattern{
	static int num;
	static int[] lengthes;
	static void setN(int n){
		num = n;
	}
	static  void setLengthes(int[] lengthes){
		Pattern.lengthes = lengthes;
	}
	int aLength = 0;
	int bLength = 0;
	int cLength = 0;
	boolean flag = true;
	int mp = -30;
	Pattern(int p){
		for(int i = 0; i < num; i++){
			int q = (int) (p / Math.pow(4, i)) % 4;
			switch(q){
				case 0: aLength += lengthes[i]; mp += 10; break;
				case 1: bLength += lengthes[i]; mp += 10; break;
				case 2: cLength += lengthes[i]; mp += 10; break;
			}
		}
		if(aLength == 0 || bLength == 0 || cLength == 0){
			flag = false;
		}
	}
	int calcMP(int a, int b, int c){
		if(flag){
			return mp + Math.abs(a - aLength) + Math.abs(b - bLength) + Math.abs(c - cLength);
		}else{
			return Integer.MAX_VALUE;
		}
	}
}