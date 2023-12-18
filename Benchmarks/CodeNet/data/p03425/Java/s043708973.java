import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String[] strArr = new String[N];
		int x = 0;

		for (int i = 0; i < N; i++) {
			strArr[i] = s.next();
		}

		for (int i = 0; i < N - 2; i++) {
			if (strArr[i].charAt(0)=='M'
					|| strArr[i].charAt(0)=='A'
					|| strArr[i].charAt(0)=='R'
					|| strArr[i].charAt(0)=='C'
					|| strArr[i].charAt(0)=='H') {

				for (int j = i + 1; j < N - 1; j++) {
					if (strArr[j].charAt(0)=='M'
							|| strArr[j].charAt(0)=='A'
							|| strArr[j].charAt(0)=='R'
							|| strArr[j].charAt(0)=='C'
							|| strArr[j].charAt(0)=='H')  {

						for (int k = j + 1; k < N; k++) {
							if (strArr[k].charAt(0)=='M'
									|| strArr[k].charAt(0)=='A'
									|| strArr[k].charAt(0)=='R'
									|| strArr[k].charAt(0)=='C'
									|| strArr[k].charAt(0)=='H')  {
								if (strArr[i].charAt(0)==(strArr[j].charAt(0))
										|| strArr[i].charAt(0)==(strArr[k].charAt(0))
										|| strArr[j].charAt(0)==(strArr[k].charAt(0))) {
								}else{
									x++;
								}
							}
						}
					}
				}
			}
		}

		System.out.println(x);
	}
}