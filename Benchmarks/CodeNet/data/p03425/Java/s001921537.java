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
			if (strArr[i].substring(0, 1).equals("M") || strArr[i].substring(0, 1).equals("A")
					|| strArr[i].substring(0, 1).equals("R") || strArr[i].substring(0, 1).equals("C")
					|| strArr[i].substring(0, 1).equals("H")) {

				for (int j = i + 1; j < N - 1; j++) {
					if (strArr[j].substring(0, 1).equals("M") || strArr[j].substring(0, 1).equals("A")
							|| strArr[j].substring(0, 1).equals("R") || strArr[j].substring(0, 1).equals("C")
							|| strArr[j].substring(0, 1).equals("H")) {

						for (int k = j + 1; k < N; k++) {
							if (strArr[k].substring(0, 1).equals("M") || strArr[k].substring(0, 1).equals("A")
									|| strArr[k].substring(0, 1).equals("R") || strArr[k].substring(0, 1).equals("C")
									|| strArr[k].substring(0, 1).equals("H")) {
								if (strArr[i].substring(0, 1).equals(strArr[j].substring(0, 1)) || strArr[i].substring(0, 1).equals(strArr[k].substring(0, 1))
										|| strArr[j].substring(0, 1).equals(strArr[k].substring(0, 1))) {
								}else{
									System.out.println("i:"+i+":"+strArr[i]+
														" j:"+j+":"+strArr[j]+
														" k:"+k+":"+strArr[k]);
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