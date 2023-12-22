import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] num = new int[n];
			int[] ans = new int[n];
			for(int i = 0; i < n; i++){
				int count = 0;
				num[i] = sc.nextInt();
				String str = String.valueOf(fact(num[i]));
				String temp = "";
				char c;
				for(int j = 0; j < str.length()-1; j++){
					c = str.charAt(str.length()-j-1);
					if(c == '0') count++;
					if(c != '0') break;
				}
				ans[i] = count;
			}
			for(int i = 0; i < n; i++){
				System.out.println(ans[i]);
			}
		}
	}
	static long fact(int n){
		long sum = 1;
		for(int i = n; i > 0; i--){
			sum *= i;
		}
		return sum;
	}
}