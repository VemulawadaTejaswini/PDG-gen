import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] c = s.toCharArray();
		int count = 1;

		for(int i = 0;i < n-1;i++){
			if(c[i] == c[i+1]){

			}else{
				count++;
			}
		}

		System.out.println(count);
	}

}