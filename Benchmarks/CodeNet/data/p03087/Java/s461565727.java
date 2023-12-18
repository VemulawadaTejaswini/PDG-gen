import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();
		int cnt = 0;

		for(int i = 0; i < Q;  i++){
			String val = s.substring(sc.nextInt()-1, sc.nextInt());
			char[] target = val.toCharArray();

			for(int j = 0; j < target.length; j++){
				if(target[j] == 'A'){
					if(j < target.length - 1){
						if (target[j + 1] == 'C'){
						cnt++;
						}
					}
				}
			}

			System.out.println(cnt);
			cnt = 0;
		}

		sc.close();
	}
}
