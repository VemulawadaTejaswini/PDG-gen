import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
//
		for(int i=0 ; i<n ; i++) {
			if(i%3==0 || i%5==0) {
				continue;
			}
			else {
				count ++;
			}
		}
		System.out.println(count);
	}
}