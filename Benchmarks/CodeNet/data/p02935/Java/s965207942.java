import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =    sc.nextInt();
		double num = 0;
		int arnum[] = new int[a];
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < a;i++) {
			int b =    sc.nextInt();
			arnum[i] = b;
		}
		Arrays.sort(arnum);
		if(arnum.length > 1 ) {
		for(int i = 0; i < arnum.length - 1;i++) {
			arnum[i + 1] = arnum[i] + arnum[i + 1] / 2;
		}
		}
       System.out.println(arnum[a]);
	}
}